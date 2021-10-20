package string;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String arr) {

        int sum=0;
        char[] s = arr.toCharArray();

        for(int i=0; i<s.length;i++){

            switch(s[i]){

                case 'I':
                    sum+=1;
                    break;

                case 'V':

                    if(i==0)
                        sum+=5;
                    else if(i>0){
                        if(s[i-1] == 'I'){
                            sum+=3;
                        }else
                            sum+=5;
                    }
                    else
                        sum+=5;

                    break;

                case 'X':

                    if(i==0)
                        sum+=10;
                    else if(i>0){
                        if(s[i-1] == 'I'){
                            sum+=8;
                        }else
                            sum+=10;
                    }
                    else
                        sum+=10;

                    break;

                case 'L':


                    if(i==0)
                        sum+=50;
                    else if(i>0){
                        if(s[i-1] == 'X'){
                            sum+=30;
                        }else
                            sum+=50;
                    }
                    else
                        sum+=50;

                    break;

                case 'C':

                    if(i==0)
                        sum+=100;
                    else if(i>0){
                        if(s[i-1] == 'X'){
                            sum+=80;
                        }else
                            sum+=100;
                    }
                    else
                        sum+=100;

                    break;

                case 'D':

                    if(i==0)
                        sum+=500;
                    else if(i>0){
                        if(s[i-1] == 'C'){
                            sum+=300;
                        }else
                            sum+=500;
                    }
                    else
                        sum+=500;
                    break;

                case 'M':

                    if(i==0)
                        sum+=1000;
                    else if(i>0){
                        if(s[i-1] == 'C'){
                            sum+=800;
                        }else
                            sum+=1000;
                    }
                    else
                        sum+=1000;
                    break;

            }
        }
        return sum;
    }
}
