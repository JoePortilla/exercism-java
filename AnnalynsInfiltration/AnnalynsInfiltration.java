public class AnnalynsInfiltration {

    public static void main(String[] args) {
        System.out.println(canFastAttack(true));
        System.out.println(canSpy(false, true, false));
        System.out.println(canSignalPrisoner(false, true));
        System.out.println(canFreePrisoner(false, true, false, false));
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean status = true;

        if (knightIsAwake == true) {
            status = false;
        } else {
            status = true;

        }
        return status;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake,
            boolean prisonerIsAwake) {
        boolean status = true;

        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean status = true;

        if (archerIsAwake == false && prisonerIsAwake == true) {
            status = true;
        } else {
            status = false;
        }

        return status;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        boolean status = true;
        if (archerIsAwake == false && petDogIsPresent == true) {
            status = true;
        } else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true
                && petDogIsPresent == false) {
            status = true;
        } else {
            status = false;
        }
        return status;

    }
}
