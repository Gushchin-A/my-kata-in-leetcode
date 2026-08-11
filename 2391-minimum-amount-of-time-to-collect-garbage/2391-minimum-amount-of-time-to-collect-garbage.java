class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int houses = travel.length + 1;
        int[] pickingM = getMinutesInHouses(garbage, 'M', houses);
        int[] pickingP = getMinutesInHouses(garbage, 'P', houses);
        int[] pickingG = getMinutesInHouses(garbage, 'G', houses);

        int lastHouseM = getIndexLastHouse(pickingM);
        int lastHouseP = getIndexLastHouse(pickingP);
        int lastHouseG = getIndexLastHouse(pickingG);

        int totalM = getTotalMinutesAndDriving(pickingM, lastHouseM, travel);
        int totalP = getTotalMinutesAndDriving(pickingP, lastHouseP, travel);
        int totalG = getTotalMinutesAndDriving(pickingG, lastHouseG, travel);

        return totalM + totalP + totalG;
    }

    private int[] getMinutesInHouses(String[] garbage, char type, int houses) {
        int[] result = new int[houses];

        int index = 0;
        for (String part : garbage) {
            for (char c : part.toCharArray()) {
                if (c == type) {
                    result[index]++;
                }
            }
            index++;
        }

        return result;
    }

    private int getIndexLastHouse(int[] picking) {
        int lastHouse = 0;

        int index = 0;
        for (int i = picking.length - 1; i >= 0; i--) {
            if (picking[i] != 0) {
                lastHouse = i;
                break;
            }
        }

        return lastHouse;
    }

    private int getTotalMinutesAndDriving(int[] picking, int lastHouse, int[] travel) {
        int sumMinutes = 0;
        for (int i = 0; i < picking.length; i++) {
            sumMinutes += picking[i];
        }

        int sumDriving = 0;
        for (int i = 0; i < lastHouse; i++) {
            sumDriving += travel[i];
        }

        return sumMinutes + sumDriving;
    }
}
