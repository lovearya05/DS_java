#include <iostream>

using namespace std;

struct vals{
    char name[20];
    int beds;
};

int main()
{
    cout<<"Enter no of hospital : ";
    int n=2;
    cin>>n;
    struct vals obj[n];
    
    for(int i=0;i<n;i++){
        
        cout<<"Enter the name of the hospital : ";
        cin>>obj[i].name;
        cout<<"Enter beds available : ";
        cin>>obj[i].beds;
        
    }
    
    cout<<endl<<endl;
    

    for(int i=0;i<n-1;i++){
        
        for(int j=0;j<n-i-1;j++){
            
            if(obj[j].beds<obj[j+1].beds){
                
                struct vals temp;
                
                temp = obj[j+1];
                
                obj[j+1] = obj[j];
                
                obj[j] = temp;
            }
            
        }
        
    }

    cout<<endl<<endl;

    cout<<"hospital name\tbeds available\n";
    
    for(int i=0;i<n;i++){
        
        cout<<obj[i].name<<"\t\t\t"<<obj[i].beds<<endl;
        
    }

    
    return 0;
}
