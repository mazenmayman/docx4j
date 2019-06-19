package org.docx4j.model.listnumbering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberFormatLowerLetter extends NumberFormat
{
	protected static Logger log = LoggerFactory.getLogger(NumberFormatLowerLetter.class);
	
	public String format( int in )
	{
		StringBuilder out = new StringBuilder();
		int num = (in % 26 > 0) ? (in % 26) : 26; // for z
		int count = (int) java.lang.Math.ceil((double) in / 26);
		while(count > 0)
		{
			out.append(Character.forDigit(num+9, 36));
			count--;
		}
		return out.toString();
	}
}