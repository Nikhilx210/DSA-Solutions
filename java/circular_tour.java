public class circular_tour {
    int tour(int petrol[], int distance[])
    {
	// Your code here	
    int totalsum=0;
        for(int i=0;i<petrol.length;i++){
            petrol[i]=petrol[i]-distance[i];
        }
        for(int i=0;i<petrol.length;i++){
            totalsum+=petrol[i];
        }
        if(totalsum < 0){
            return -1;
        }
        int ans=-1;
        int backsum=0;
        for(int i=0;i<petrol.length;i++){
            if(petrol[i]>=0){
                int remaining_pet=0;
                remaining_pet=petrol[i];
                ans=i;
                for(int j=i+1;j<petrol.length;j++){
                    remaining_pet+=petrol[j];
                    if(remaining_pet<0){
                        break;
                    }
                    if(j==petrol.length){
                        if(remaining_pet+backsum>=0){
                            return ans;
                        }
                    }
                }
            }
            backsum+=petrol[i];
        }
        return ans;
    }
}
