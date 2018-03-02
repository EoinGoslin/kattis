/**
 * file: bing.cpp
 * project: bingQuestion
 * author: eoin 17252409
 * email: eoingoslin@gmail.com
 * created: Saturday, 24th February 2018 9:53:20 pm
 * modified: Tuesday, 27th February 2018 11:36:34 am
 * filepath: /home/eoin/Desktop/kattis/bingQuestion/bing.cpp
 * comment: comment
 */
//
#include <iostream>
using namespace std;
bool checkWords(string pastWord, string currentWord){
if(currentWord.length() > pastWord.length()) {
    return false;
}
if(pastWord.substr(0, currentWord.length()).compare(currentWord)){
    return true;
}
return false;       
}

int main() {
        
// cout<<"Hello"<<endl;
int numLines, counter = 0;
cin>>numLines;
string prevWords[numLines];
bool checker = true;
for(int i = 0; i < numLines;i++){
    string currentWord;
    cin>>currentWord;
    int current = 0, numTimes = 0;
    string *wordpointer = &prevWords[current];//e.g.histories
    while(wordpointer != NULL){
        
        checker = checkWords(prevWords[current], currentWord);
        if(checker)
        numTimes++;
        current++;
        *wordpointer = prevWords[current];
    } 
    cout<<numTimes<<endl;
    prevWords[counter++] = currentWord;
}
   }

   





    
