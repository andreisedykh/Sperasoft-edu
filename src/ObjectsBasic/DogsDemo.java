package ObjectsBasic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DogsDemo {

    private static int dataIndex=1;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String testCase = "10 Penny small 2 big 10 5 Leonard 7";

        System.out.println("Default data: " + testCase);
        findDogs(testCase);

        while (true){
            try{
                System.out.println("Enter your dogs data:\n");
                String newDogsData = scanner.nextLine();
                dataIndex=1;
                findDogs(newDogsData);
            }
            catch(Exception e){
                System.out.println("Invalid input: " + e.toString());
            }
        }
    }

    public static void findDogs(String dogsInfo){
        String [] dogsData = dogsInfo.split(" ");
        int dogsNumber = Integer.parseInt(dogsData[0]);
        Dog dogs[] = new Dog[dogsNumber];

        for (int i = 0; i < dogsNumber; i++){
            dogs[i] = new Dog(getDogData(dogsData));
            System.out.println(String.format("Dog id: - %d, Name - %s, Size - %s, Age - %d. \n", i+1, dogs[i].getName(), dogs[i].getSize().toString(), dogs[i].getAge()));
        }

        Arrays.sort(dogs, new Comparator<Dog>(){
            @Override
            public int compare(Dog dog1, Dog dog2) {
                return  dog1.getName().compareTo(dog2.getName());
            }
        });

        System.out.println("Dogs array after sort:\n");
        for (int i = 0; i < dogsNumber; i++){
            System.out.println(String.format("Dog id: - %d, Name - %s, Size - %s, Age - %d. \n", i+1, dogs[i].getName(), dogs[i].getSize().toString(), dogs[i].getAge()));
        }
    }

    // Parse data from string to dog format data
    public static String[] getDogData(String dogsData[]){
        String[] dog = new String[3];

        for (; dataIndex < dogsData.length; dataIndex++){
            //If fist element - age
            if(dogsData[dataIndex].matches("-?\\d+")){
                dog[0] = dogsData[dataIndex];
                dataIndex++;
                return dog;
            }
            //If fist element - size
            else if(dogsData[dataIndex].equals(Dog.Size.small.toString()) ||dogsData[dataIndex].equals(Dog.Size.big.toString()) ||dogsData[dataIndex].equals(Dog.Size.medium.toString())){
                dog[0] = dogsData[dataIndex];
                if(dogsData[dataIndex+1].matches("-?\\d+")){
                    dog[1] = dogsData[dataIndex+1];
                    dataIndex+=2;
                    return dog;
                }
                dataIndex++;
                return dog;
            }
            //If fist element - name
            else {
                dog[0] = dogsData[dataIndex];

                if(dogsData[dataIndex+1].matches("-?\\d+")){
                    dog[1] = dogsData[dataIndex+1];
                    dataIndex+=2;
                    return dog;
                }

                else if(dogsData[dataIndex+1].equals(Dog.Size.small.toString()) ||dogsData[dataIndex+1].equals(Dog.Size.big.toString()) ||dogsData[dataIndex+1].equals(Dog.Size.medium.toString())){
                    dog[1] = dogsData[dataIndex+1];
                    if(dogsData[dataIndex+2].matches("-?\\d+")){
                        dog[2] = dogsData[dataIndex+2];
                        dataIndex+=3;
                        return dog;
                    }
                    dataIndex++;
                    return dog;
                }
            }
        }
        return dog;
    }
}