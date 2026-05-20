public class MiniParkingSystem {

int [] slotSpace = new int [20];

    
    public static int [] parkingSlotSpace(int [] slotSpace) {

        //slotSpace = new int [20];
        int car = 0;

        for(int index = 0; index < slotSpace.length; index++) {

            if(car == 1)
                slotSpace[index] = 1;

        }
        return slotSpace;


        }


    public static boolean [] IsfreeSlot (int [] slotSpace) {

        boolean isFree = false;

        for(int index = 0; index < slotSpace.length; index++) {

            if(slotSpace[index] == 0)
                isFree = true;
                
    }

        return isFree;
   }


    public static int [] newEmptySlot (int [] slotSpace) {

         for(int index = 0; index < slotSpace.length; index++) {



    }

            


    }





    public static void main(String[] args) {
        

    }
        


    }



