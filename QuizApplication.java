public class QuizApplication {
 public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "Which planet is known as the Red Planet?"
        };
          String[] answers = {
            "Paris",
            "4",
            "Mars"
        };
        String[] userAnswers = {
            "Paris",  
            "4",      
            "Mars"    
        };
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println("Your answer: " + userAnswers[i]);

            if (userAnswers[i].equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i] + "\n");
            }
        }
        System.out.println("Quiz Over!");
        System.out.println("Your total score: " + score + "/" + questions.length);
    }
}
