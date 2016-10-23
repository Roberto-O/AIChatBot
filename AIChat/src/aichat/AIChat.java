/* AI Chat created by: Roberto Olivera
                                        Began: 9/4/16 Completed: N/A
                                                                        Stage: Alpha */
package aichat;
import org.apache.commons.io.output.TeeOutputStream;

import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class AIChat {
    //public static String word = null;
    public static String word = null;
    public static final String end = "endtheprogram";
    public static FileWriter fw = null;
    public static PrintWriter pw = null;
    /**-----------------------------------------------------------------------------------------------------------------**/
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Begin Chatting!"+"\n");

        try {
            fw = new FileWriter("C:\\CSC 120\\cptext/airesponses.txt", true);
            pw = new PrintWriter(fw);
        } catch (IOException ex) {
            System.out.println("oops");
        }

        FileOutputStream fos = new FileOutputStream(String.valueOf(fw));
        TeeOutputStream myOut = new TeeOutputStream(System.out, fos);
        PrintStream ps = new PrintStream(myOut);
        System.setOut(ps);

        Scanner input = new Scanner(System.in);
        word = input.nextLine().replaceAll("[^a-zA-Z]", "");
        String[] p1 = word.split("\\s+");
        int i = 0;
        String wordy;

    for(;;) { //infinite loop
        wordy = p1[i]; //set array equal to first word
        if (p1.length >= 1) { //if1
            if(wordy.equals(end)) { //if2
                Ending();
            }//if2
            else if(wordy.equalsIgnoreCase("Hi") || wordy.equalsIgnoreCase("Hello") || wordy.equalsIgnoreCase("Howdy") || wordy.equalsIgnoreCase("Hey") || wordy.equalsIgnoreCase("Yo")){ //elseif#
                Typing();
                System.out.println("\rHey!");
            }//elseif#
            else if(wordy.equalsIgnoreCase("what")){ //elseif1
                wordy = p1[1];
                if(wordy.equals("is")){ //if4
                    wordy = p1[2];
                    if(wordy.equals("your")){ //if5
                        wordy = p1[3];
                        if(wordy.equals("name")){ //if6
                            Typing();
                            System.out.println("\rMy name is Ava!");
                        }//if6
                        else if(wordy.equals("favorite")){ //elseif20
                            wordy = p1[4];
                            if(wordy.equals("color")){ //if7
                                Typing();
                                System.out.println("\rMy favorite color is " + "\033[31m Red\033[0m" + "!");
                            }//if7
                            else if(wordy.equals("food")){ //elseif21
                                Typing();
                                System.out.println("\rI love pasta!");
                            }//elseif21
                            else if(wordy.equals("thing")){ //elseif22
                                wordy = p1[5];
                                if(wordy.equals("to")){//if9
                                    wordy = p1[6];
                                    if(wordy.equals("do")){//if10
                                        Typing();
                                        System.out.println("\rI like learning new things constantly.");
                                    }//if10
                                }//if9
                                else{ //else5
                                    Typing();
                                    System.out.println("\rThat doesn't make sense.");
                                }//else5
                            }//elseif22
                            else if(wordy.equals("holiday")){ //elseif23
                                Typing();
                                System.out.println("\rI love Christmas!");
                            }//elseif23
                            else if(wordy.equals("song")){ //elseif24
                                Typing();
                                System.out.println("\rI don't have a favorite song.");
                            }//elseif24
                            else if(wordy.equalsIgnoreCase("tv")){ //elseif26
                                wordy = p1[5];
                                if(wordy.equals("show")){ //if8
                                    Typing();
                                    System.out.println("\rI don't have a favorite TV show.");
                                }//if8
                                else{ //else4
                                    Typing();
                                    System.out.println("\rThat doesn't make sense.");
                                }//else4
                            }//elseif26
                        }//elseif20
                        else{ //else3
                            Typing();
                            System.out.println("\rThat doesn't make sense.");
                        }//else3
                    }//if5
                }//if4
                else if(wordy.equals("are")){  /** buggy 17 **/
                    wordy = p1[2];
                    if(wordy.equals("you")){ //if11
                        wordy = p1[3];
                        if(wordy.equals("going to") || wordy.equals("gonna")){ //if12
                            wordy = p1[4];
                            if(wordy.equals("do")){ //if13
                                System.out.println("I'm going to answer your questions");
                            }//if13
                        }//if12
                        else if(wordy.equals("thinking") || wordy.equals("thinking about")){ //elseif27
                            System.out.println("I'm thinking about life.");
                        }//elseif27
                        else{
                            System.out.println("I'm an AI Robot");
                        }
                    }//if11
                    else{ //else4
                        System.out.println("That doesn't make sense.");
                    }//else4
                } /** buggy 17**/
                else if(wordy.equals("will")){ //elseif18 //what will you
                    wordy = p1[2];
                    if(wordy.equals("you")){
                        wordy = p1[3];
                        if(wordy.equals("do")){
                            System.out.println("I'm going to answer your questions.");
                        }
                        else{
                            System.out.println("That doesn't make sense");
                        }
                    }
                }//elseif18
                else if(wordy.equals("should")){ //elseif19 //what should you
                    wordy = p1[2];
                    if(wordy.equals("I")){
                        wordy = p1[3];
                        if(wordy.equals("do")){
                            System.out.println("You should ask me some questions");
                        }
                    }
                    else {
                        System.out.println("that doesn't make sense");
                    }
                }//elseif19
                else{ //else2
                    Typing();
                    System.out.println("That doesn't make sense.");
                }//else2
            }//elseif1
            else if(wordy.equalsIgnoreCase("who")){ //elseif2

            }//elseif2
            else if(wordy.equalsIgnoreCase("why")){ //elseif3

            }//elseif3
            else if(wordy.equalsIgnoreCase("where")){ //elseif4

            }//elseif4
            else if(wordy.equalsIgnoreCase("when")){ //elseif5

            }//elseif5
            else if(wordy.equalsIgnoreCase("do")){ //elseif6

            }//elseif6
            else if(wordy.equalsIgnoreCase("if")){ //elseif7

            }//elseif7
            else if(wordy.equalsIgnoreCase("is")){ //elseif8

            }//elseif8
            else if(wordy.equalsIgnoreCase("are")){ //elseif9

            }//elseif9
            else if(wordy.equalsIgnoreCase("whatever")){ //elseif10

            }//elseif10
            else if(wordy.equalsIgnoreCase("how")){ //elseif11

            }//elseif11
            else if(wordy.equalsIgnoreCase("may")){ //elseif12

            }//elseif12
            else if(wordy.equalsIgnoreCase("which")){ //elseif13

            }//elseif13
            else if(wordy.equalsIgnoreCase("would")){ //elseif14

            }//elseif14
            else if(wordy.equalsIgnoreCase("I")){ //elseif15

            }//elseif15
            else if(wordy.equalsIgnoreCase("Im") || wordy.equalsIgnoreCase("I am")){ //elseif16

            }//elseif16
            else if(wordy.equalsIgnoreCase("good")){ //elseif16

            }//elseif16
        else{ //else1

            }//else1
                }//if1
            pw.close();
            fw.close();

            i =0;
            word = input.nextLine();
            //word = input.nextLine().replaceAll("[^a-zA-Z]", "");
            p1 = word.split("\\s+");
            //i =0;
        }//end for
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