/*

Three Friends are given three rows of the keyboard, The first row is given to Shyam,second row is given to gopal, third row is given to ramu. 

Teacher has given them few lines of words and asked each individual if they can print the words that can be printed using the letters of the rows given to them 

Shyam has given the row -   QWERTYUIOP/qwertyuiop
Gopal has given the row -    ASDFGHIJKL/asdfghjkl
Ramu has given the row -   ZXCVBNM/zxcvbnm

Teacher also gave the following rules in addition ;
    You may use one character in the row more than once.
    You may assume the input string will only contain letters of alphabet(A-Z/a-z).
    Assume the alphabets are case sensitive 

    Print -1 for all Boundary Conditions 

Example:

input =hello Alaska Dad Peace
output = 
Alaska 
Dad


Here the words Alaska and Dad are the characters of second student gopal only   


input =asdf qwer zxcv
output =
asdf
qwer
zxcv

input =Dad hAS the Key
output = Dad
hAS

input =to be or not TO be 
output = to
or
TO
*/

#include <bits/stdc++.h>
using namespace std;

// declarations of helper functions..
vector<string> getWordsOfPurelySingleRow(vector<string> list);
bool isOfUpperRow(string word);
bool isOfMiddleRow(string word);
bool isOfBottomRow(string word);

// driver code..
int main(){
    string line, word;
    getline(cin, line);
    stringstream ss(line);
    vector<string> input;
    while(ss >> word)
        input.push_back(word);
    vector<string> list = getWordsOfPurelySingleRow(input);
    if(list.size() == 0)
        cout << -1;
    else
        for(string chunk: list)
            cout << chunk << endl;
}


// implementations of helpers..
vector<string> getWordsOfPurelySingleRow(vector<string> list){
    vector<string> result;
    for(string word: list)
        if(isOfUpperRow(word) || isOfMiddleRow(word) || isOfBottomRow(word))        // if it belongs solely to any specific row..
            result.push_back(word);                                                 // add it to the list..
    
    return result;
}

bool isOfUpperRow(string word){
    for(char ch: word)
        switch(tolower(ch)){
            case 'q':
            case 'w':
            case 'e':
            case 'r':
            case 't':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'p': break;
            default: return false;      //for characters of different row..
        }
    // control will be here, if belongs to only this row..so
    return true;
}

bool isOfMiddleRow(string word){
    for(char ch: word)
        switch(tolower(ch)){
            case 'a':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l': break;
            default: return false;      //for characters of different row..
        }
    // control will be here, if belongs to only this row..so
    return true;
}

bool isOfBottomRow(string word){
    for(char ch: word)
        switch(tolower(ch)){
            case 'z':
            case 'x':
            case 'c':
            case 'v':
            case 'b':
            case 'n':
            case 'm': break;
            default: return false;      //for characters of different row..
        }
    // control will be here, if belongs to only this row..so
    return true;
}

/**
 * case = 1
input =QPWoertl aLdSkjDGh mNzXCv qwert
output =
aLdSkjDGh
mNzXCv
qwert


case = 2
input =asdf qwer zxcv
output =
asdf
qwer
zxcv

case = 3
input =Dad has the Key and flaG
output = Dad
has
flaG

case = 4
input =to be or not to be 
output = to
or
to

case = 5
input =ascv
output = -1

case = 6
input =a B c D e F
output = 
a
B
c
D
e
F
 * 
 */