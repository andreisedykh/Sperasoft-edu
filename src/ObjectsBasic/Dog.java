package ObjectsBasic;

import java.util.Random;

public class Dog {

    private String name;
    private Integer age;
    private Size size;

    public enum Size{
        big, //енумы лучше писать с большой буквы
        small,
        medium;
        //есть встроенный метод valueOf, который делает то же самое
        public static Size parseSize(String size){
            if(size.equals(Size.small.toString()))
                return Size.small;

            else if (size.equals(Size.big.toString()))
                return Size.big;
            else
                return Size.medium;
        }
    }

    public Dog(String  args[]){

        int argsNumber = countArgs(args);

        if(argsNumber == 3){
            this.name = args[0];
            this.size = Size.parseSize(args[1]);
            this.age = Integer.parseInt(args[2]);

        }
        else if(argsNumber == 2) {
            checkArg(args[0]);
            checkArg(args[1]);

            if(this.name == null)
                this.name = generateName();
            else if (this.age == null)
                this.age = generateAge();
            else
                this.size = generateSize();
        }
        else if(argsNumber == 1){
            checkArg(args[0]);

            if(this.name == null)
                this.name = generateName();
            if (this.age == null)
                this.age = generateAge();
            if (this.size == null)
                this.size = generateSize();
        }
        else{
            this.name = generateName();
            this.age = generateAge();
            this.size = generateSize();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Size getSize() {
        return size;
    }

    public Size generateSize(){

        int maxSize = 3;
        int minSize = 1;
        Random random = new Random();
        int sizeId =  random.nextInt(maxSize - minSize + 1) + minSize;

        switch (sizeId){
            case 1:
                return Size.big;
            case 2:
                return Size.medium;
            case 3:
                return Size.small;
            default:
                return size.medium;
        }
    }

    private int generateAge(){
        int maxAge = 20;
        int minAge = 1;
        Random random = new Random();
        return  random.nextInt(maxAge - minAge + 1) + minAge;
    }


    public String generateName() {
        String[] Beginning = { "Va", "Le", "Ra", "Mrok", "Cru", "Sos", "Ig", "Pas" };
        String[] Middle = { "the", "loh", "kaz", "mraz", "buch", "lu" };
        String[] End = { "ev", "ov", "ey", "is", "es", "pin" };

        Random rand = new Random();

        return Beginning[rand.nextInt(Beginning.length)] + Middle[rand.nextInt(Middle.length)]+ End[rand.nextInt(End.length)];
    }

    private void checkArg(String arg){


        if(arg.matches("-?\\d+")){          // if arg - age
            this.age = Integer.parseInt(arg);
        }
        else if(arg.equals(Size.small.toString()) || arg.equals(Size.big.toString())
                || arg.equals(Size.medium.toString())){                                     // if arg - size
            this.size = Size.parseSize(arg);
        }
        else{
            this.name = arg;
        }
    }

    private int countArgs(String [] args) {
        int numberOfArgs = 0;
        for(String arg: args) {
            if(arg != null)
                numberOfArgs++;
        }
        return numberOfArgs;
    }

}