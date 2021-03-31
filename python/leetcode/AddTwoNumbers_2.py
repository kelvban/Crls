class ListNode(object):
	def __init__(self,val,next):
		self.val=val
		self.next=next
class AddTwoNumbers(object):
	def addTwoNumbers(self,l1,l2):
		if l1==None:
			return l2
		if l2==None:
			if l1.val>=10:
				l2=ListNode(0,None)
			else:
				return l1
		sum=l1.val+l2.val
		l1.val=sum%10
		if sum>=10:
			if l1.next==None:
				l1.next=ListNode(1,None)
			else:
				l1.next.val+1
		l1.next=addTwoNumbers(l1.next,l2.next)
		return l1

