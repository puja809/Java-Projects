import java.util.Scanner;

public class QuestionService {
    Questions[] questions=new Questions[5];
    String answer[]=new String[5];
    public QuestionService(){
        questions[0]=new Questions(1,"size of int","4","6","8","10","4");
        questions[1]=new Questions(2,"size of boolean","4","6","8","1","1");
        questions[2]=new Questions(3,"size of char","4","6","2","10","2");
        questions[3]=new Questions(4,"size of long","4","6","8","10","8");
        questions[4]=new Questions(5,"size of double","4","6","8","10","8");

    }
    public void playQuiz() {
        for(int i=0;i<questions.length;i++) {
            System.out.println("Question " + questions[i].getId() + ": " + questions[i].getQues());
            System.out.println(questions[i].getOpt1());
            System.out.println(questions[i].getOpt2());
            System.out.println(questions[i].getOpt3());
            System.out.println(questions[i].getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer: ");
            answer[i] = sc.nextLine();

        }
    }
    public void score(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            String actualAns=questions[i].getAns();
            String userAns=answer[i];
            if (actualAns.equals(userAns)){
                score++;
            }
        }
        System.out.println("Your Score is: "+score);
    }
    }
