#include <iostream>

using namespace std;

struct vals{
    char name[20];
    int id;
};

int main()
{
    struct vals lib[5];
    
    for(int i=0;i<5;i++){
        
        cout<<"Enter the name of the book: ";
        cin>>lib[i].name;
        cout<<"Enter book id: ";
        cin>>lib[i].id;
        
    }
    
    cout<<endl<<endl;
    
    for(int i=0;i<5;i++){
        
        cout<<"Book : "<<lib[i].name<<" Book id: "<<lib[i].id<<endl;
        
    }

    for(int i=0;i<5-1;i++){
        
        for(int j=0;j<5-i-1;j++){
            
            if(lib[j].id>lib[j+1].id){
                
                struct vals temp;
                
                temp = lib[j+1];
                
                lib[j+1] = lib[j];
                
                lib[j] = temp;
            }
            
        }
        
    }

    cout<<endl<<endl;
    
    for(int i=0;i<5;i++){
        
        cout<<"Book : "<<lib[i].name<<" Book id: "<<lib[i].id<<endl;
        
    }

    
    return 0;
}