import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class FootballMatch extends JFrame{
    int milanScore = 0;
    int madridScore = 0;
    String lastScorer = "N/A";
    String win = "DRAW";
    JPanel btnPanel = new JPanel();
    JPanel labelPanel = new JPanel();
    JButton btn1 = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Result: " + milanScore + " X " + madridScore);
    JLabel label2 = new JLabel("Last Scorer: " + lastScorer);
    JLabel label3 = new JLabel("Winner: " + win);

    public FootballMatch(){
        super("Football Match");
        setLayout(new FlowLayout());
        setSize(400,150);
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        labelPanel.add(label1);
        labelPanel.add(label2);
        labelPanel.add(label3);
        add(labelPanel);
        add(btnPanel);
        btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                showWinner();
                UpdateScore();
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        btn2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScore++;
                lastScorer = "Real Madrid";
                showWinner();
                UpdateScore();
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void UpdateScore(){
        label1.setText("Result: " + milanScore + " X " + madridScore);
        label2.setText("Last Scorer: " + lastScorer);
        label3.setText("Winner: " + win);
    }

    public void showWinner(){
        if(milanScore<madridScore)
            win = "Real Madrid";
        else if(milanScore>madridScore)
            win = "AC Milan";
        else
            win = "DRAW";
    }

    public static void main(String[] args) {
        new FootballMatch().setVisible(true);
    }
}
