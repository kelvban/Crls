#include <iostream>
using namespace std;

struct Tree{
	int val;
	struct Tree* left;
	struct Tree* right;
	Tree(int x) :
			val(x), left(NULL), right(NULL) {
	} 
};

class Solution{
	public:
		int treeDepth(Tree* tRoot){
			if(tRoot==NULL){
				return 0;
			}
			int leftDepth=treeDepth(tRoot->left);
			int rightDepth=treeDepth(tRoot->right);
			return ((leftDepth>rightDepth)?leftDepth:rightDepth)+1;
		}
};

