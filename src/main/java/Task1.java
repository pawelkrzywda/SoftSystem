public class Task1 {

    public int firstPerfectSquare(int n){

        if(n < 0){
            return 0;
        }

        int result = n+1;
        boolean isPerfectSquare = false;

        while(!isPerfectSquare){
        double number = Math.sqrt(result);
        if(number - Math.floor(number) == 0){
            isPerfectSquare=true;
        }else {
            result++;
        }
        }

        return result;
    }
}