package agh.cs.constitution;

/**
 * Created by Joanna on 2016-12-03.
 */
public class ParseInstructions {


    public int[] parseArguments(String[] args) {
        int result[]=new int [3];
        if (args.length <= 4 && args.length >=3 ) {

            if (args.length == 4) {
                result[1] = stringToInt(args[2]);
                result[2] = stringToInt(args[3]);
                if (result[2] < result[1]) {
                    throw new IllegalArgumentException(args[2] + "Podano niepoprawny przedział.");
                }
            } else {
                result[1] = stringToInt(args[2]);
                result[2]=result[1];
            }
            switch (args[1]) {
                case "c":
                    result[0] = 1;
                    break;
                case "C":
                    result[0] = 1;
                    break;
                case "chapter":
                    result[0] = 1;
                    break;
                case "Chapter":
                    result[0] = 1;
                    break;
                case "a":
                    result[0] = 0;
                    break;
                case "A":
                    result[0] = 0;
                    break;
                case "article":
                    result[0] = 0;
                    break;
                case "Article":
                    result[0] = 0;
                    break;
                default:
                    throw new IllegalArgumentException(args[1] + "Można wyświetlać tylko akapity i rozdziały,Bład argumentów");
            }
        }else
        throw new IllegalArgumentException(args[1] + "Podano niewłasciwą ilosc argumentów");

   return result;}

    private int stringToInt (String a){
        int res = Integer.parseInt(a);
    return res;}

}

