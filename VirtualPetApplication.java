import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner setup = new Scanner(System.in);

        System.out.println("Welcome to Digipet");

        System.out.println("What would you like to name your pet?");

        String petName = setup.nextLine();

        VirtualPet pet = new VirtualPet(0, 0, 0, 0, 0, 0, petName);

        while (true) {
            System.out.println("                            ..,,,,,,,,,.. \r\n" + //
                    "                     .,;%%%%%%%%%%%%%%%%%%%%;,. \r\n" + //
                    "                   %%%%%%%%%%%%%%%%%%%%////%%%%%%, .,;%%;, \r\n" + //
                    "            .,;%/,%%%%%/////%%%%%%%%%%%%%%////%%%%,%%//%%%, \r\n" + //
                    "        .,;%%%%/,%%%///%%%%%%%%%%%%%%%%%%%%%%%%%%%%,////%%%%;, \r\n" + //
                    "     .,%%%%%%//,%%%%%%%%%%%%%%%%@@%a%%%%%%%%%%%%%%%%,%%/%%%%%%%;, \r\n" + //
                    "   .,%//%%%%//,%%%%///////%%%%%%%@@@%%%%%%///////%%%%,%%//%%%%%%%%, \r\n" + //
                    " ,%%%%%///%%//,%%//%%%%%///%%%%%@@@%%%%%////%%%%%%%%%,/%%%%%%%%%%%%% \r\n" + //
                    ".%%%%%%%%%////,%%%%%%%//%///%%%%@@@@%%%////%%/////%%%,/;%%%%%%%%/%%% \r\n" + //
                    "%/%%%%%%%/////,%%%%///%%////%%%@@@@@%%%///%%/%%%%%//%,////%%%%//%%%' \r\n" + //
                    "%//%%%%%//////,%/%a`  'a%///%%%@@@@@@%%////a`  'a%%%%,//%///%/%%%%% \r\n" + //
                    "%///%%%%%%///,%%%%@@aa@@%//%%%@@@@S@@@%%///@@aa@@%%%%%,/%////%%%%% \r\n" + //
                    "%%//%%%%%%%//,%%%%%///////%%%@S@@@@SS@@@%%/////%%%%%%%,%////%%%%%' \r\n" + //
                    "%%//%%%%%%%//,%%%%/////%%@%@SS@@@@@@@S@@@@%%%%/////%%%,////%%%%%' \r\n" + //
                    "`%/%%%%//%%//,%%%///%%%%@@@S@@@@@@@@@@@@@@@S%%%%////%%,///%%%%%' \r\n" + //
                    "  %%%%//%%%%/,%%%%%%%%@@@@@@@@@@@@@@@@@@@@@SS@%%%%%%%%,//%%%%%' \r\n" + //
                    "  `%%%//%%%%/,%%%%@%@@@@@@@@@@@@@@@@@@@@@@@@@S@@%%%%%,/////%%' \r\n" + //
                    "   `%%%//%%%/,%%%@@@SS@@SSs@@@@@@@@@@@@@sSS@@@@@@%%%,//%%//%' \r\n" + //
                    "    `%%%%%%/  %%S@@SS@@@@@Ss` .,,.    'sS@@@S@@@@%'  ///%/%' \r\n" + //
                    "      `%%%/    %SS@@@@SSS@@S.         .S@@SSS@@@@'    //%%' \r\n" + //
                    "               /`S@@@@@@SSSSSs,     ,sSSSSS@@@@@' \r\n" + //
                    "             %%//`@@@@@@@@@@@@@Ss,sS@@@@@@@@@@@'/ \r\n" + //
                    "           %%%%@@00`@@@@@@@@@@@@@'@@@@@@@@@@@'//%% \r\n" + //
                    "       %%%%%%a%@@@@000aaaaaaaaa00a00aaaaaaa00%@%%%%% \r\n" + //
                    "    %%%%%%a%%@@@@@@@@@@000000000000000000@@@%@@%%%@%%% \r\n" + //
                    " %%%%%%a%%@@@%@@@@@@@@@@@00000000000000@@@@@@@@@%@@%%@%% \r\n" + //
                    "%%%aa%@@@@@@@@@@@@@@0000000000000000000000@@@@@@@@%@@@%%%% \r\n" + //
                    "%%@@@@@@@@@@@@@@@00000000000000000000000000000@@@@@@@@@%%%%%");
            System.out.println("\n" + pet.getName() + "'s status:");
            System.out.println("age:"+pet.getAge());
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("playfulness: " + pet.getPlayfulness());
            System.out.println("Thirst:" + pet.getThirst());
            System.out.println("Sleepiness: " + pet.getSleepiness());
            System.out.println("health:"+ pet.getHealth());

            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Feed your pet");
            System.out.println("2. Play with your pet");
            System.out.println("3. Fill your pet's water bowl");
            System.out.println("4. Give your pet a nap");
            System.out.println("5. give medicine");
            System.out.println("6. Quit the game");

            int choice = setup.nextInt();
            setup.nextLine();

            pet.Activity();

            switch (choice) {

                case 1:
                    pet.feed();
                    System.out.println("You fed" + pet.getName());
                    break;
                case 2:
                    pet.play();
                    System.out.println(pet.getName() + " played with you.");
                    break;
                case 3:
                    pet.pourWater();
                    System.out.println(pet.getName() + " have hydrated your dog");
                    break;
                case 4:
                    pet.sleep();
                    System.out.println(pet.getName() + " took a nap");
                    break;
                case 5:
                pet.heal();
                System.out.println(pet.getName() +"treated your pet");
                break;
                case 6:
                    System.out.println("Thanks for playing! Goodbye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
if (pet.getHunger() == 100) {
                System.out.println("\nYour pet has starved to death");
            } else if (pet.getThirst() == 100) {
                System.out.println("\n Your pet has died of dehydration");
            } else if (pet.getSleepiness() == 100) {
                System.out.println("\nYour pet took a 'forever nap'");
            } else if (pet.getPlayfulness() == 0) {
                System.out.println("Your pet died of a broken heart ;(");
            } else if (pet.getHealth() == 0) {
                System.out.println("Damn your dog is dead");
            }

            if (pet.getHunger() == 100 || pet.getThirst() == 100 || pet.getSleepiness() == 100
                    || pet.getPlayfulness() == 0) {
                System.out.println("\n" + pet.getName() + "'s status:");
                System.out.println("Age: " + pet.getAge() + "Yr's Old");
                System.out.println("Hunger: " + pet.getHunger()) ;
                System.out.println("Playfulness: " + pet.getPlayfulness());
                System.out.println("Thirst:" + pet.getThirst());
                System.out.println("Sleepiness: " + pet.getSleepiness());
                System.out.println("health:"+ pet.getHealth()+"\n");
                System.out.println(pet.getName() + " has lived to " + pet.getAge() + " Yr's Old!\n");
                System.out.println("Play again and try to raise you pet to a higher age");
                setup.close();
                System.exit(0);
            }

        }
    }

}
