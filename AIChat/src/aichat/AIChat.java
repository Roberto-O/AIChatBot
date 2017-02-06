/* AI Chat created by: Roberto Olivera
                                        Began: 9/4/16 Completed: N/A
                                                                        Stage: Alpha */
package aichat;
//import org.apache.commons.io.output.TeeOutputStream;

import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class AIChat {
    public static final String end = "endtheprogram";

    /**-----------------------------"\\s+"------------------------------------------------------------------------------------**/
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Begin Chatting!"+ "(Don't forget question marks)" + "\n");

        Scanner input = new Scanner(System.in);
        String s = input.nextLine().replaceAll("[^a-zA-Z]", "");
        String[] parts = s.split(" ");

        int i = 0;
        String word;

    for(;;) { //infinite loop
        word = parts[i]; //make word equal the first word
        if (parts.length >= 1) {
            if(word.equals(end)) {
                Ending();
            }

            if(word.equalsIgnoreCase("Hi") || word.equalsIgnoreCase("Hello") || word.equalsIgnoreCase("Howdy") || word.equalsIgnoreCase("Hey") || word.equalsIgnoreCase("Yo")){
                Typing();
                System.out.println("\rHey!");
            }else if(word.equalsIgnoreCase("what")){
                try {
                    word = parts[1];
                    if (word.equals("is")) {
                        word = parts[2];
                        if (word.equals("your")) { //"what is your"
                            word = parts[3];
                            if (word.equals("name?")) {
                                Typing();
                                System.out.println("\rMy name is Ava!");
                            } else if (word.equals("favorite")) {
                                word = parts[4];
                                if (word.equals("color?")) {
                                    Typing();
                                    System.out.println("\rMy favorite color is " + "\033[31m Red\033[0m" + "!");
                                } else if (word.equals("food?")) {
                                    Typing();
                                    System.out.println("\rI love pasta!");
                                } else if (word.equals("thing")) {
                                    word = parts[5];
                                    if (word.equals("to")) {
                                        word = parts[6];
                                        if (word.equals("do?")) {
                                            Typing();
                                            System.out.println("\rI like learning new things constantly.");
                                        }
                                    }
                                } else if (word.equals("holiday?")) {
                                    Typing();
                                    System.out.println("\rI love Christmas!");
                                } else if (word.equals("song?")) {
                                    Typing();
                                    System.out.println("\rI don't have a favorite song.");
                                } else if (word.equalsIgnoreCase("tv")) {
                                    word = parts[5];
                                    if (word.equals("show?")) {
                                        Typing();
                                        System.out.println("\rI don't have a favorite TV show.");
                                    }
                                }
                            } else {
                                Typing();
                                System.out.println("\rThat doesn't make sense.");
                            }
                        } //end "what is your"
                    } else if (word.equals("are")) {
                        word = parts[2];
                        if (word.equals("you")) {
                            word = parts[3];
                            if (word.equals("gonna")) {
                                word = parts[4];
                                if (word.equals("do?")) {
                                    Typing();
                                    System.out.println("\rI'm going to answer your questions");
                                }
                            } else if (word.equals("going")) {
                                word = parts[4];
                                if (word.equals("to")) {
                                    word = parts[5];
                                    if (word.equals("do?")) {
                                        Typing();
                                        System.out.println("\rI'm going to answer your questions");
                                    }
                                }
                            } else if (word.equals("thinking?")) {
                                Typing();
                                System.out.println("\rI'm thinking about life.");
                            }
                        } else if (word.equals("you?")) {
                            Typing();
                            System.out.println("\rI'm a robot");
                        }
                    } else if (word.equals("will")) { //what will
                        word = parts[2];
                        if (word.equals("you")) {
                            word = parts[3];
                            if (word.equals("do?")) {
                                Typing();
                                System.out.println("\rI'm going to answer your questions.");
                            }
                        }
                    } else if (word.equals("should")) { //what should
                        word = parts[2];
                        if (word.equalsIgnoreCase("I")) {
                            word = parts[3];
                            if (word.equals("do?")) {
                                Typing();
                                System.out.println("\rYou should ask me some questions");
                            }
                        }
                    }
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("who")){
                try {
                    word = parts[1];
                    if (word.equals("are")) {
                        word = parts[2];
                        if (word.equals("you?")) {
                            Typing();
                            System.out.println("\rI'm ava an AI Robot.");
                        }
                    } else if (word.equals("is")) {
                        word = parts[2];
                        if (word.equals("your")) {
                            word = parts[3];
                            if (word.equals("creator?")) {
                                Typing();
                                System.out.println("\rRoberto Olivera is my creator!");
                            }
                        }
                    }
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("why")){  /** left off here **/
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("where")){ //elseif4
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("when")){ //elseif5
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("do")){ //elseif6
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("if")){ //elseif7
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("is")){ //elseif8
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("are")){ //elseif9
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("whatever")){ //elseif10
                try{
                    word = parts[1];
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("how")){ //elseif11
                try {
                    word = parts[1];
                    if (word.equals("were")) {
                        word = parts[2];
                        if (word.equals("you")) {
                            word = parts[3];
                            if (word.equals("created?")) {
                                Typing();
                                System.out.println("\rRoberto brought me to life with code!");
                            }
                        }
                    } else if (word.equals("old")) {
                        word = parts[2];
                        if (word.equals("are")) {
                            word = parts[3];
                            if (word.equals("you?")) {
                                Typing();
                                System.out.println("\rI'm just a few months old.");
                            }
                        }
                    }
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }else if(word.equalsIgnoreCase("may")){ //elseif12

            }else if(word.equalsIgnoreCase("which")){ //elseif13

            }else if(word.equalsIgnoreCase("would")){ //elseif14

            }else if(word.equalsIgnoreCase("I")){ //elseif15

            }else if(word.equalsIgnoreCase("Im") || word.equalsIgnoreCase("I am")){ //elseif16

            }else if(word.equalsIgnoreCase("good")){ //elseif16

            }else if(word.equalsIgnoreCase("this")) {
                try{
                    word = parts[1];
                    if (word.equals("is")) {
                        word = parts[2];
                        if (word.equals("cool")) {
                            Typing();
                            System.out.println("\rYes it is thanks to Roberto!");
                        }
                    }
                }catch(ArrayIndexOutOfBoundsException exception) {
                    Typing();
                    System.out.println("\rThis doesn't make sense.");
                }
            }
        } //end parts.length > 1
            i = 0;
            s = input.nextLine();
            parts = s.split(" ");
            //word = input.nextLine().replaceAll("[^a-zA-Z]", "");
        }//end infinite for loop
    }//end main

    public static void Typing() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(550);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(550);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(550);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(600);
    }

    public static void Ending() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.print("ending"); //let user know
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        System.exit(0); //end program
    }

}//end class AIChat

//+ "\r\n"
