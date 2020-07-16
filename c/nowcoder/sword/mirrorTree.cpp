#include<iostream>

using namespace std;
/*
struct TreeNode {
	int val;
	struct TreeNode *left;
	struct TreeNode *right;
	TreeNode(int x) :
			val(x), left(NULL), right(NULL) {
	}
};*/
class Solution {
public:
    void Mirror(TreeNode *pRoot) {
        if(pRoot==NULL){
            return;
        }
        if(pRoot->left==NULL&&pRoot->right==NULL){
            return;
        }
        TreeNode * temp=NULL;
        temp=pRoot->right;
        pRoot->right=pRoot->left;
        pRoot->left=temp;
        
        if(pRoot->left!=NULL){
            Mirror(pRoot->left);
        }
        if(pRoot->right!=NULL){
            Mirror(pRoot->right);
        }
    }
};
