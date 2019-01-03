public class SortAlgorithm {
	public static void mergeSort(int[] ints, int leftStart,int rightEnd) {
		if(leftStart==rightEnd) {
			return;
		}
		int leftEnd=(rightEnd-leftStart)/2+leftStart;
		mergeSort(ints,leftStart,leftEnd);
		mergeSort(ints,leftEnd+1,rightEnd);
		merge(ints,leftStart,leftEnd,rightEnd);
    }  
    public static void merge(int[]ints, int leftStart, int leftEnd, int rightEnd) {
        int[] tmp=new int[rightEnd-leftStart+1];
        int index=0;
        int r=leftEnd+1;
        int l=leftStart;
        while(l!=leftEnd+1&&r!=rightEnd) {
        	if(ints[l]>ints[r]) {
        		tmp[index]=ints[r];
        		r++;
        		index++;
        	}
        	else if(ints[l]<ints[r]){
        		tmp[index]=ints[l];
        		l++;
        		index++;
        	}
        	else {
        		tmp[index]=ints[r];
        		r++;
        		index++;
        	}
        }
        while(l<=leftEnd) {
              tmp[index]=ints[l];
              l++;
              index++;
        }
        while(r<=rightEnd) {
            tmp[index]=ints[r];
            r++;
            index++;
      }
        for(int i=0;i<tmp.length;i++) {
        	ints[leftStart+i]=tmp[i];
        }
    }
    public static void toString(int[] ints) {
    	for(int e:ints) {
    		System.out.print(e+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] ints= {1,3,-1,4,2,8,9};
         //           0,1,2,3
         mergeSort(ints,0,6);
         toString(ints);
	}

}
