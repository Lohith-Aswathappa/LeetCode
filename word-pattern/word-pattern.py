class Solution(object):
    def wordPattern(self, pattern, s):
        dict1={}
        dict2={}
        l=[]
        l = (s.split(" "))
        if(len(l)!=len(pattern)):
            return False
        for i in range (0,len(pattern)):
            if (pattern[i] in dict1 and dict1[pattern[i]] != l[i]):
                return False
            else:
                dict1[pattern[i]] = l[i]
        for i in range (0,len(l)):
            if (l[i] in dict2 and dict2[l[i]] != pattern[i]):
                return False
            else:
                dict2[l[i]] = pattern[i]
        return True
