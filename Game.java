package JosephLifeandDeathGame;

public class Game {
    static int[] people = new int[31];
    static int n = 1;
    static int s = 0;

    public static int Sum(int[] arr){
        int sum = 0;
        for(int tmp: arr){
            sum = sum + tmp;
        }
        return sum;
    }

    public static void main(String[] args){

        for(int i = 1;i <= 30;i++){
            people[i] = 1;
        }



           for(;Game.Sum(people) > 15;n++) {
               if (people[n] == 1) {
                   s++;
                   if(s == 9){
                       s = 0;
                       people[n] = 0;
                       System.out.println("第" + n + "号被扔进海里");
                   }
                   n = n % 30;
               }
               else {
                   n = n % 30;
                   continue;
               }

           }

    }
}
