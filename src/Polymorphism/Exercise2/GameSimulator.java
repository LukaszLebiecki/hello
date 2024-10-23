package Polymorphism.Exercise2;

public class GameSimulator {
    public static void main(String[] args) {
        AttackCharacter character1 = new AttackCharacter("Joe", 100, 100, 100, 0.5);
        AttackCharacter character2 = new AttackCharacter("Martha", 100, 100, 100, 0.2);
        DefenseCharacter character3 = new DefenseCharacter("Kris", 100, 100, 100, 0.2);
        AttackCharacter character4 = new AttackCharacter("Matt", 100, 100, 100, 0.2);
        AttackCharacter character5 = new AttackCharacter("Martha", 100, 100, 100, 0.2);
        DefenseCharacter character6 = new DefenseCharacter("Belly", 100, 100, 100, 0.2);

        Team teamOne = new Team("TeamOne", character1, character2, character3);
        Team teamTwo = new Team("TeamTwo", character4, character5, character6);
        BattleSimulator.fight(teamOne, teamTwo);

    }
}
