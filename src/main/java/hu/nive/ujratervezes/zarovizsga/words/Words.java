package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public boolean hasMoreDigits (String s){
        int numbers = 0;
        int chars = 0;
        for (char c: s.toCharArray()) {

            if (Character.isDigit(c)) {
                numbers = numbers + 1 ;
            }
            else {
                chars = chars +1;
            }
        }
        if (numbers >chars) return true;
        return false;
    }



}
