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

        public Tree yourDone(String ending, String answer) {
          this.addChild(ending, answer);
          Tree currParent = this;
          while(currParent != null && currParent.getChildren().size() == 2) {
            currParent = currParent.getParent();
          }
          if(currParent == null) return null;
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
        JFrame frame = new JFrame("Java Text Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Use BorderLayout
        frame.setLayout(new BorderLayout());

        JLabel text = new JLabel("<html>You wake up in a mysterious land. What is your first move?</html>", SwingConstants.CENTER);
        frame.add(text, BorderLayout.CENTER);

        // Create panel for buttons at bottom
        JPanel buttonPanel = new JPanel(new BorderLayout());

        JButton leftButton = new JButton("Follow path");
        JButton rightButton = new JButton("Explore silently");

        final Tree[] initial = {new Tree("You wake up in a mysterious land. What is your first move?", "Start")};
    // ChatGPT Generated this tree for obvious reasons:
initial[0]
    .addChild("You enter the dark forest. Do you follow the path or explore the trees?", "Follow path")
        .addChild("You approach a river. Do you build a raft or swim across?", "Build raft")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Speak to villagers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Explore silently")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
        .addChild("You approach a river. Do you build a raft or swim across?", "Swim across")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Speak to villagers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Explore silently")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
    .addChild("You enter the dark forest. Do you follow the path or explore the trees?", "Explore trees")
        .addChild("You approach a river. Do you build a raft or swim across?", "Build raft")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Speak to villagers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Explore silently")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
        .addChild("You approach a river. Do you build a raft or swim across?", "Swim across")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Speak to villagers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
            .addChild("You reach a village. Do you speak to the villagers or explore silently?", "Explore silently")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Enter ruins")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                .addChild("You find an ancient ruin. Do you enter or investigate outside?", "Investigate outside")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Find shelter")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers")
                    .addChild("A storm approaches. Do you find shelter or press forward?", "Press forward")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Enter cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You are trapped and must turn back.", "Investigate whispers")
                                .yourDone("You discover a secret passage.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You survive the storm but lose supplies.", "Investigate whispers")
                                .yourDone("You befriend locals and gain guidance.", "Ignore whispers")
                        .addChild("You spot a cave. Do you enter or bypass it?", "Bypass cave")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Climb down")
                                .yourDone("You fall into a trap and barely escape.", "Investigate whispers")
                                .yourDone("You uncover ancient knowledge.", "Ignore whispers")
                            .addChild("You see a cliff. Do you climb down or search for a safer path?", "Search path")
                                .yourDone("You are chased by a wild creature.", "Investigate whispers")
                                .yourDone("You find treasure and allies.", "Ignore whispers");


        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                initial[0] = initial[0].getChildren().get(0);
                text.setText("<html><body style='text-align:center'>" + initial[0].getCurr() + "</body></html>");
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
                text.setText("<html><body style='text-align:center'>" + initial[0].getCurr() + "</body></html>");
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
