package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int array_size;
    int numOfElements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        array_size=size;
        list = new int[array_size];
        numOfElements = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numOfElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        int new_Size;
        if (array_size == 0) {
            new_Size = 1;
        } else {
            new_Size = array_size * 2;
        }

        int[] new_List = new int[new_Size];

        for (int i = 0; i < numOfElements; i++) {
            new_List[i] = list[i];
        }

        list = new_List;
        array_size = new_Size;
    }

    public void addElement(int newVal) {
        if (numOfElements == array_size) {
            increaseSize();
        }

        list[numOfElements] = newVal;
        numOfElements++;
    }

    public void removeFirst(int newVal) {
        int frst_occ =-1;
        for(int i=0;i<numOfElements;i++){
            if(list[i]==newVal){
                frst_occ=i;
                break;
            }
        }
        if(frst_occ!=-1){
           for(int i=frst_occ;i<numOfElements-1;i++){
            list[i]=list[i+1];
        } 
        numOfElements--;
        list[numOfElements]=0;
        }
    }

    public void removeAll(int newVal) {
        int idx_while_delete=0;
       for(int array_idx=0;array_idx<numOfElements;array_idx++){
            if(list[array_idx]!=newVal){
                list[idx_while_delete]=list[array_idx];
                idx_while_delete++;
            }
        }
        for(int i=idx_while_delete;i<numOfElements;i++){
            list[i]=0;
        }
        numOfElements=idx_while_delete;
    }
}