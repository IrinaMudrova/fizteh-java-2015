/**
 * Created by alex on 19.09.15.
 */
public class Reverser {
    public static void main(String[] args){
        for (int i = args.length - 1; i >= 0; ++i) {
            String[] splittedStr = args[i].split("\\s+");
            for(int j = splittedStr.length - 1; j >= 0; ++j){
                System.out.println(splittedStr[j] + " ");
            }
        }
        System.out.print('\n');
    }
}
