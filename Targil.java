 public static void main(String[] args) {

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        helloWord();
        print1_100();
        even_not_even(s);
        

        // 1. Create a function that prints "hello world" , call it from main
        helloWord();

        // 2. Create a function that prints all numbers from 1 to 100, call it from main
        print1_100();

        //  3. Create a function that inputs a number and prints if the number is even (zugi) or not, call it from main
        even_not_even(s);

        //   4. **etgar: input the number from main instead of inside the function
        int a = s.nextInt();
        even_not_even(s); 

        

    }
        private static void even_not_even (Scanner s){
            System.out.println(" Enter the number: ");
            int numbers = s.nextInt();
            if (numbers % 2 == 0)
                System.out.println(" the number is even");
            else
                System.out.println(" the number is not even");
        }

        private static void print1_100 () {
            for (int x = 0; x <= 100; x++)
                System.out.println(x);
        }

        private static void helloWord () {
            String[] word = {"Hello word"};
            for (int i = 0; i < word.length; i++) {
                System.out.println(word[i]);
            }
        }
    }
