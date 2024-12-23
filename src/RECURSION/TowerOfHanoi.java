package RECURSION;

public class TowerOfHanoi {
    public static void main(String[] args) {
        tower(3, 'A', 'B', 'C');
    }

    static void tower(int n , char source, char auxiliary, char destination){

        // base case
        if (n == 1){
            System.out.println(source + " -> " + destination);
            return;
        }

        tower(n-1,source, destination, auxiliary );
        tower(n, source, auxiliary, destination);
        tower(n-1, auxiliary,source,destination);

    }
}
