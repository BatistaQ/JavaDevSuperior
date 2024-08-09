public class Main {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria","Bob","Alex"};

        for(int i =0; i<vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("--------");
        //Para cada pessoa 'people' contido em 'vect', faça
        for(String people : vect){
            System.out.println(people);
        }
    }
}