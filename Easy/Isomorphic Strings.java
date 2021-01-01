/*
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings 
{
	public boolean isIsomorphic(String s, String t)
	{
		Map<Character,Character> mapping = new HashMap<>();
	    Set<Character> visited = new HashSet<>();
	    char sChar, tChar;
	    
	    for(int i = 0; i < s.length(); i++)
	    {
	    	sChar = s.charAt(i);
	    	tChar = t.charAt(i);

	        if (!mapping.containsKey(sChar) && !visited.contains(tChar))
	        {
	        	mapping.put(sChar,tChar);
	            visited.add(tChar);
	        }
	        
	        else if (mapping.containsKey(sChar) && mapping.get(sChar) == tChar)
	            continue;
	        
	        else
	            return false;
	    }
	    
	    return true;
	}
	
	public static void main(String[] args)
	{
		IsomorphicStrings sol = new IsomorphicStrings();
		System.out.print(sol.isIsomorphic("paper", "title"));
	}
}
