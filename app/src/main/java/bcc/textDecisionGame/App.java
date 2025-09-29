package bcc.textDecisionGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class App {
    public static class Tree {
        private String answer;
        private String current;
        private ArrayList<Tree> children = new ArrayList<Tree>();
        private Tree parent;

        public Tree(String initial, String answer) {
            current = initial;
            this.answer = answer;
        }

        public Tree(String initial, String answer, Tree parent) {
            current = initial;
            this.answer = answer;
            this.parent = parent;
        }

        public Tree addChild(String question, String answer) {
            Tree tree = new Tree(question, answer, this);
            children.add(tree);
            return tree;
        }

        public Tree yourDone(String answer) {
          Tree currParent = this;
          while(currParent.getChildren().size() == 2) {
            currParent = currParent.getParent();
          }
          addChild("Your Done!", answer);
          return currParent;
        }

        public Tree getParent() {
            return parent;
        }

        public String getCurr() {
            return current;
        }

        public String getAns() {
            return answer;
        }

        public ArrayList<Tree> getChildren() {
            return children;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Use BorderLayout
        frame.setLayout(new BorderLayout());

        JLabel text = new JLabel("Would you rather spend time indoors or outdoors?", SwingConstants.CENTER);
        frame.add(text, BorderLayout.CENTER);

        // Create panel for buttons at bottom
        JPanel buttonPanel = new JPanel(new BorderLayout());

        JButton leftButton = new JButton("Indoors");
        JButton rightButton = new JButton("Outdoors");

        final Tree[] initial = {new Tree("Would you rather spend time indoors or outdoors?", "Start")};
    // ChatGPT Generated this tree for obvious reasons:
initial[0]
.addChild("Would you rather read a book or watch a movie?", "Indoors")
  .addChild("Do you prefer fiction or nonfiction?", "Read a book")
    .addChild("Do you prefer fantasy or realistic stories?", "Fiction")
      .addChild("Do you like stories with magic?", "Fantasy")
        .addChild("Do you prefer long epics or short tales?", "Magic")
          .yourDone( "Long epics")
          
          .yourDone( "Short tales")
          
        
        .addChild("Do you like character-driven or plot-driven stories?", "Magic")
          .yourDone( "Character-driven")
          
          .yourDone( "Plot-driven")
          
        
      
      .addChild("Do you prefer historical fiction or modern stories?", "Realistic")
        .addChild("Do you prefer medieval or modern-day settings?", "Realistic")
          .yourDone( "Medieval")
          
          .yourDone( "Modern")
          
        
        .addChild("Do you like action-driven or character-driven plots?", "Realistic")
          .yourDone( "Action-driven")
          
          .yourDone( "Character-driven")
          
        
      
    
    .addChild("Do you prefer biographies or documentaries?", "Nonfiction")
      .addChild("Do you like political or personal stories?", "Nonfiction")
        .addChild("Do you prefer in-depth or summary style?", "Political")
          .yourDone( "In-depth")
          
          .yourDone( "Summary")
          
        
        .addChild("Do you prefer in-depth or summary style?", "Personal")
          .yourDone( "In-depth")
          
          .yourDone( "Summary")
          
        
      
      .addChild("Do you like nature or science documentaries?", "Nonfiction")
        .addChild("Do you prefer marine or terrestrial topics?", "Nature")
          .yourDone( "Marine")
          
          .yourDone( "Terrestrial")
          
        
        .addChild("Do you prefer physics or biology topics?", "Science")
          .yourDone( "Physics")
          
          .yourDone( "Biology")
          
        
      
    
  
  .addChild("Do you prefer comedies or dramas?", "Watch a movie")
    .addChild("Do you like slapstick or witty satire?", "Comedies")
      .addChild("Do you like classic or modern comedy?", "Comedies")
        .addChild("Do you prefer visual or verbal gags?", "Classic")
          .yourDone( "Visual")
          
          .yourDone( "Verbal")
          
        
        .addChild("Do you prefer visual or verbal gags?", "Modern")
          .yourDone( "Visual")
          
          .yourDone( "Verbal")
          
        
      
      .addChild("Do you like physical or verbal humor?", "Comedies")
        .addChild("Do you prefer slapstick or situational?", "Physical")
          .yourDone( "Slapstick")
          
          .yourDone( "Situational")
          
        
        .addChild("Do you prefer witty or absurd humor?", "Verbal")
          .yourDone( "Witty")
          
          .yourDone( "Absurd")
          
        
      
    
    .addChild("Do you enjoy thrillers or romances?", "Dramas")
      .addChild("Do you like mysteries or suspense?", "Thrillers")
        .addChild("Do you prefer detective or psychological?", "Mysteries")
          .yourDone( "Detective")
          
          .yourDone( "Psychological")
          
        
        .addChild("Do you prefer conspiracy or action?", "Suspense")
          .yourDone( "Conspiracy")
          
          .yourDone( "Action")
          
        
      
      .addChild("Do you like tragic or happy endings?", "Romances")
        .addChild("Do you prefer classic or modern romance?", "Tragic")
          .yourDone( "Classic")
          
          .yourDone( "Modern")
          
        
        .addChild("Do you prefer classic or modern romance?", "Happy")
          .yourDone( "Classic")
          
          .yourDone( "Modern");
initial[0]
.addChild("Would you rather go hiking or swimming?", "Outdoors")
  .addChild("Do you prefer mountain trails or flat trails?", "Hiking")
    .addChild("Do you enjoy steep climbs or gentle walks?", "Mountain trails")
      .addChild("Do you like scenic views or physical challenge?", "Steep climbs")
        .addChild("Do you prefer morning or evening hikes?", "Scenic views")
          .yourDone( "Morning")
          
          .yourDone( "Evening")
          
        
        .addChild("Do you prefer morning or evening hikes?", "Physical challenge")
          .yourDone( "Morning")
          
          .yourDone( "Evening")
          
        
      
      .addChild("Do you like forest exploration or wildlife spotting?", "Gentle walks")
        .addChild("Do you prefer following trails or wandering off?", "Forest exploration")
          .yourDone( "Following trails")
          
          .yourDone( "Wandering off")
          
        
        .addChild("Do you prefer following trails or wandering off?", "Wildlife spotting")
          .yourDone( "Following trails")
          
          .yourDone( "Wandering off")
          
        
      
    
    .addChild("Do you enjoy solo hikes or group hikes?", "Flat trails")
      .addChild("Do you like peaceful walks or social interaction?", "Solo hikes")
        .addChild("Do you prefer short or long walks?", "Peaceful walks")
          .yourDone( "Short")
          
          .yourDone( "Long")
          
        
        .addChild("Do you prefer short or long walks?", "Social interaction")
          .yourDone( "Short")
          
          .yourDone( "Long")
          
        
      
      .addChild("Do you prefer short day trips or extended trips?", "Group hikes")
        .addChild("Do you like challenging or easy routes?", "Short day trips")
          .yourDone( "Challenging")
          
          .yourDone( "Easy")
          
        
        .addChild("Do you like challenging or easy routes?", "Extended trips")
          .yourDone( "Challenging")
          
          .yourDone( "Easy")
          
        
      
    
  
  .addChild("Do you prefer lakes or oceans?", "Swimming")
    .addChild("Do you like calm waters or active waves?", "Lakes")
      .addChild("Do you prefer paddle boating or fishing?", "Calm waters")
        .addChild("Do you prefer solo or group activity?", "Paddle boating")
          .yourDone( "Solo")
          
          .yourDone( "Group")
          
        
        .addChild("Do you prefer solo or group activity?", "Fishing")
          .yourDone( "Solo")
          
          .yourDone( "Group")
          
        
      
      .addChild("Do you enjoy swimming laps or relaxing?", "Active waves")
        .addChild("Do you prefer morning or evening swims?", "Swimming laps")
          .yourDone( "Morning")
          
          .yourDone( "Evening")
          
        
        .addChild("Do you prefer morning or evening swims?", "Relaxing")
          .yourDone( "Morning")
          
          .yourDone( "Evening")
          
        
      
    
    .addChild("Do you like snorkeling or surfing?", "Oceans")
      .addChild("Do you prefer observing marine life or riding waves?", "Snorkeling")
        .addChild("Do you prefer shallow or deep waters?", "Observing marine life")
          .yourDone( "Shallow")
          
          .yourDone( "Deep")
          
        
        .addChild("Do you prefer shallow or deep waters?", "Riding waves")
          .yourDone( "Shallow")
          
          .yourDone( "Deep")
          
        
      
      .addChild("Do you like shortboards or longboards?", "Surfing")
        .addChild("Do you prefer tricks or cruising?", "Shortboards")
          .yourDone( "Tricks")
          
          .yourDone( "Cruising")
          
        
        .addChild("Do you prefer tricks or cruising?", "Longboards")
          .yourDone( "Tricks")

          .yourDone( "Cruising");

        System.out.println(initial[0]);
        initial[0].getChildren().forEach(child -> System.out.println(child.getAns() + "  " + child.getCurr()));
        initial[0].getChildren().forEach(child -> child.getChildren().forEach(grandChild -> System.out.println(grandChild.getAns() + "  " + grandChild.getCurr())));

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initial[0] = initial[0].getChildren().get(0);
                text.setText(initial[0].getCurr());
                if(initial[0].getChildren().size() < 2) {
                    buttonPanel.removeAll();
                    JButton next = new JButton("Continue");
                    next.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        main(args);
                      }
                    });
                    buttonPanel.add(next, BorderLayout.CENTER);
                    return;
                }
                Tree a = initial[0].getChildren().get(0);
                Tree b = initial[0].getChildren().get(1);
                leftButton.setText(a.getAns());
                rightButton.setText(b.getAns());
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initial[0] = initial[0].getChildren().get(1);
                text.setText(initial[0].getCurr());
                if(initial[0].getChildren().size() < 2) {
                    buttonPanel.removeAll();
                    JButton next = new JButton("Continue");
                    next.addActionListener(new ActionListener() {
                      public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        main(args);
                      }
                    });
                    buttonPanel.add(next, BorderLayout.CENTER);
                    return;
                }
                Tree a = initial[0].getChildren().get(0);
                Tree b = initial[0].getChildren().get(1);
                leftButton.setText(a.getAns());
                rightButton.setText(b.getAns());
            }
        });

        buttonPanel.add(leftButton, BorderLayout.WEST);
        buttonPanel.add(rightButton, BorderLayout.EAST);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Show frame
        frame.setVisible(true);
    }
}
