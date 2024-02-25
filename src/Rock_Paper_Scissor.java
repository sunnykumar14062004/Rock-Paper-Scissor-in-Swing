import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class Rock_Paper_Scissor {

    static void change (String you, JLabel your_choice, JLabel computer_choice, JLabel result){
        Random rand_int = new Random();
        int computer = rand_int.nextInt(3);
        String comp, res;

        if (computer == 0){
            comp = "Rock";
        }
        else if (computer == 1) {
            comp = "Paper";
        }
        else{
            comp = "Scissor";
        }

        if (you.equals("Rock") && comp.equals("Scissor")){
            res = "You Won";
        }
        else if (you.equals("Paper") && comp.equals("Rock")){
            res = "You Won";
        }
        else if (you.equals("Scissor") && comp.equals("Paper")){
            res = "You Won";
        }

        else if (you.equals("Rock") && comp.equals("Paper")){
            res = "You Lost";
        }
        else if (you.equals("Paper") && comp.equals("Scissor")){
            res = "You Lost";
        }
        else if (you.equals("Scissor") && comp.equals("Rock")){
            res = "You Lost";
        }

        else {
            res = "Draw";
        }

        your_choice.setText("You : " + you);
        computer_choice.setText("Computer : " + comp);
        result.setText(res);

        if (res.equals("Draw")) {
            result.setForeground(Color.GRAY);
            result.setBounds(120, 370, 400, 60);
        }
        else if (res.equals("You Lost")){
            result.setForeground(Color.RED);
            result.setBounds(90, 370, 400, 60);
        }
        else{
            result.setForeground(Color.GREEN);
            result.setBounds(100, 370, 400, 60);
        }
    }

    public static void main (String[] args){

        Font title_font = new Font("Arial Rounded MT Bold", Font.BOLD, 34);
        Font option_font = new Font("Cascadia Code", Font.PLAIN, 18);
        Font choice_font = new Font("Agency FB", Font.PLAIN, 26);
        Font result_font = new Font("Castellar", Font.BOLD, 32);

        JFrame window = new JFrame("Rock Paper Scissor");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 500);
        window.setLocation(500, 180);
        window.setLayout(null);
        window.setVisible(true);

        JLabel game_title = new JLabel("Rock Paper Scissor");
        game_title.setForeground(Color.BLUE);
        game_title.setFont(title_font);
        game_title.setBounds(20, 20, 400, 60);
        window.add(game_title);

        JLabel your_choice = new JLabel("You : ");
        your_choice.setFont(choice_font);
        your_choice.setBounds(130, 110, 400, 60);
        window.add(your_choice);

        JLabel computer_choice = new JLabel("Computer : ");
        computer_choice.setFont(choice_font);
        computer_choice.setBounds(110, 270, 400, 60);
        window.add(computer_choice);

        JLabel result = new JLabel();
        result.setFont(result_font);
        window.add(result);

        JButton rock = new JButton("Rock");
        rock.setFont(option_font);
        rock.setBounds(20, 200, 90, 28);
        window.add(rock);
        rock.addActionListener(actionEvent -> change("Rock", your_choice, computer_choice, result));

        JButton paper = new JButton("Paper");
        paper.setFont(option_font);
        paper.setBounds(140, 200, 90, 28);
        window.add(paper);
        paper.addActionListener(actionEvent -> change("Paper", your_choice, computer_choice, result));

        JButton scissor = new JButton("Scissor");
        scissor.setFont(option_font);
        scissor.setBounds(260, 200, 100, 28);
        window.add(scissor);
        scissor.addActionListener(actionEvent -> change("Scissor", your_choice, computer_choice, result));
    }
}