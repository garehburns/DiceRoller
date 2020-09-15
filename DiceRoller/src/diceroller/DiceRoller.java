package diceroller;

public class DiceRoller {
    public static void main(String[] args) {
    
        for (int i = 0; i < 5; i++) {
            int dice = 0;
        
            int roll = (int)(Math.random() * 140) + 1;
            
            if (roll <= 20)
                dice = 4;
            else if (roll <= 40)
                dice = 6;
            else if (roll <= 60)
                dice = 8;
            else if (roll <= 80)
                dice = 10;
            else if (roll <= 100)
                dice = 12;
            else if (roll <= 120)
                dice = 20;
            else if (roll <=140)
                dice = 100;
            
            die rolledDice = new die(dice);
            
            rolledDice.roll();
            rolledDice.getFaceValue();
            rolledDice.getNumFaces();
            
            System.out.println(rolledDice.toString());
        }
    }
}