/* Generated By:JavaCC: Do not edit this line. huracanesCompiladorTokenManager.java */

/** Token Manager. */
public class huracanesCompiladorTokenManager implements huracanesCompiladorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 32:
         return jjStartNfaWithStates_0(0, 7, 104);
      case 44:
         return jjStartNfaWithStates_0(0, 15, 105);
      case 46:
         return jjStopAtPos(0, 17);
      default :
         return jjMoveNfa_0(19, 0);
   }
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 104;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 19:
                  if ((0x3ff100000000000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                     jjCheckNAdd(24);
                  }
                  else if (curChar == 45)
                     jjCheckNAddTwoStates(52, 81);
                  else if (curChar == 32)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddStates(0, 17);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                     jjCheckNAddStates(18, 23);
                  }
                  else if (curChar == 45)
                  {
                     if (kind > 14)
                        kind = 14;
                     jjCheckNAdd(23);
                  }
                  else if (curChar == 44)
                     jjCheckNAdd(3);
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if (curChar == 44)
                     jjCheckNAddStates(24, 26);
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 104:
                  if ((0x3ff100000000000L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAdd(78);
                  }
                  else if (curChar == 32)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(79);
                  }
                  else if (curChar == 45)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAddStates(27, 29);
                  }
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(70, 71);
                  if ((0x3ff100000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAdd(75);
                  }
                  else if (curChar == 32)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAddStates(27, 29);
                  }
                  else if (curChar == 45)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddStates(30, 32);
                  }
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(64, 65);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(68, 69);
                  else if (curChar == 32)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddStates(30, 32);
                  }
                  else if (curChar == 44)
                     jjCheckNAdd(3);
                  else if (curChar == 45)
                     jjCheckNAdd(52);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(62, 63);
                  else if (curChar == 32)
                     jjCheckNAddStates(33, 35);
                  else if (curChar == 44)
                     jjCheckNAddStates(24, 26);
                  if (curChar == 32)
                     jjCheckNAddStates(36, 38);
                  if (curChar == 32)
                     jjCheckNAddStates(24, 26);
                  if (curChar == 32)
                     jjCheckNAddTwoStates(50, 51);
                  break;
               case 105:
                  if ((0x3ff100000000000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                     jjCheckNAdd(24);
                  }
                  else if (curChar == 32)
                     jjCheckNAddStates(39, 46);
                  if (curChar == 44)
                     jjCheckNAdd(3);
                  else if (curChar == 32)
                     jjCheckNAddStates(24, 26);
                  if (curChar == 44)
                     jjCheckNAddStates(24, 26);
                  break;
               case 0:
                  if (curChar == 44)
                     jjCheckNAddStates(24, 26);
                  break;
               case 1:
                  if (curChar == 32)
                     jjCheckNAddStates(24, 26);
                  break;
               case 2:
                  if (curChar == 44)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if (curChar == 32)
                     jjCheckNAddStates(39, 46);
                  break;
               case 5:
                  if (curChar == 44 && kind > 3)
                     kind = 3;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 21:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 23:
                  if (curChar != 45)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(23);
                  break;
               case 24:
                  if ((0x3ff100000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(24);
                  break;
               case 44:
                  if ((0x3ff100000000000L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 49:
                  if (curChar != 32)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddStates(0, 17);
                  break;
               case 50:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(50, 51);
                  break;
               case 51:
                  if (curChar == 45)
                     jjCheckNAdd(52);
                  break;
               case 52:
                  if (curChar == 45)
                     jjCheckNAdd(53);
                  break;
               case 53:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(53, 54);
                  break;
               case 54:
                  if (curChar == 44)
                     jjCheckNAddTwoStates(55, 56);
                  break;
               case 55:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(55, 56);
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(57, 59);
                  break;
               case 57:
                  if (curChar != 44)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(58);
                  break;
               case 58:
                  if (curChar != 32)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(58);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(60, 57);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(57);
                  break;
               case 61:
                  if (curChar == 32)
                     jjCheckNAddStates(36, 38);
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(62, 63);
                  break;
               case 63:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(64, 65);
                  break;
               case 64:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(64, 65);
                  break;
               case 66:
                  if (curChar == 44 && kind > 5)
                     kind = 5;
                  break;
               case 67:
                  if (curChar == 32)
                     jjCheckNAddStates(33, 35);
                  break;
               case 68:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(68, 69);
                  break;
               case 69:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(70, 71);
                  break;
               case 70:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(70, 71);
                  break;
               case 72:
                  if (curChar == 44 && kind > 6)
                     kind = 6;
                  break;
               case 73:
                  if (curChar != 32)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddStates(30, 32);
                  break;
               case 74:
                  if (curChar != 45)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddStates(30, 32);
                  break;
               case 75:
                  if ((0x3ff100000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(75);
                  break;
               case 76:
                  if (curChar != 32)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddStates(27, 29);
                  break;
               case 77:
                  if (curChar != 45)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddStates(27, 29);
                  break;
               case 78:
                  if ((0x3ff100000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(78);
                  break;
               case 79:
                  if (curChar != 32)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(79);
                  break;
               case 80:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(52, 81);
                  break;
               case 81:
                  if (curChar == 45)
                     jjCheckNAdd(82);
                  break;
               case 82:
                  if (curChar != 45)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(82);
                  break;
               case 83:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAddStates(18, 23);
                  break;
               case 84:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 85:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 86:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 87:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 88:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 89:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 90:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 91:
                  if (curChar == 44)
                     jjCheckNAdd(92);
                  break;
               case 92:
                  if (curChar == 32)
                     jjCheckNAddStates(47, 49);
                  break;
               case 93:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(93, 94);
                  break;
               case 94:
                  if (curChar == 44)
                     jjCheckNAdd(95);
                  break;
               case 95:
                  if (curChar != 32)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAdd(95);
                  break;
               case 96:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 97:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 98:
                  if ((0x3ff000000000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 99:
                  if ((0x3ff000000000000L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 100:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(100);
                  break;
               case 101:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(101);
                  break;
               case 102:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjstateSet[jjnewStateCnt++] = 103;
                  break;
               case 103:
                  if ((0x3ff000000000000L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 19:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(52, 81);
                  if ((0x9d1288L & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                  }
                  else if (curChar == 65)
                     jjAddStates(50, 51);
                  else if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 36;
                  else if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 30;
                  else if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 28;
                  if ((0x9d1288L & l) != 0L)
                     jjCheckNAddStates(24, 26);
                  if ((0x800020L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                  }
                  else if ((0x84000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  else if (curChar == 80)
                     jjAddStates(52, 53);
                  else if (curChar == 84)
                     jjCheckNAddTwoStates(39, 40);
                  else if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 32;
                  if (curChar == 83)
                     jjCheckNAddTwoStates(39, 40);
                  else if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 104:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAdd(52);
                  if ((0x9d1288L & l) != 0L)
                     jjCheckNAddStates(24, 26);
                  break;
               case 105:
               case 0:
                  if ((0x9d1288L & l) != 0L)
                     jjCheckNAddStates(24, 26);
                  break;
               case 4:
                  if (curChar == 85)
                     jjCheckNAdd(5);
                  break;
               case 6:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if (curChar == 88)
                     jjCheckNAdd(5);
                  break;
               case 8:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 79)
                     jjCheckNAdd(5);
                  break;
               case 10:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 86)
                     jjCheckNAdd(5);
                  break;
               case 12:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 66)
                     jjCheckNAdd(5);
                  break;
               case 14:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 84)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 16:
                  if (curChar == 68)
                     jjCheckNAdd(5);
                  break;
               case 17:
                  if (curChar == 83)
                     jjCheckNAdd(5);
                  break;
               case 18:
                  if (curChar == 83)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 25:
                  if ((0x84000L & l) != 0L && kind > 23)
                     kind = 23;
                  break;
               case 26:
                  if ((0x800020L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 27:
                  if ((0x9d1288L & l) != 0L && kind > 25)
                     kind = 25;
                  break;
               case 28:
                  if (curChar == 85 && kind > 26)
                     kind = 26;
                  break;
               case 29:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 88 && kind > 26)
                     kind = 26;
                  break;
               case 31:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 79 && kind > 26)
                     kind = 26;
                  break;
               case 33:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 86 && kind > 26)
                     kind = 26;
                  break;
               case 35:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 66 && kind > 26)
                     kind = 26;
                  break;
               case 37:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 84)
                     jjCheckNAddTwoStates(39, 40);
                  break;
               case 39:
                  if (curChar == 68 && kind > 26)
                     kind = 26;
                  break;
               case 40:
                  if (curChar == 83 && kind > 26)
                     kind = 26;
                  break;
               case 41:
                  if (curChar == 83)
                     jjCheckNAddTwoStates(39, 40);
                  break;
               case 42:
                  if (curChar == 65)
                     jjAddStates(50, 51);
                  break;
               case 43:
                  if (curChar != 76)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if (curChar == 76 && kind > 22)
                     kind = 22;
                  break;
               case 46:
                  if (curChar == 80)
                     jjAddStates(52, 53);
                  break;
               case 47:
                  if (curChar != 65)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(44);
                  break;
               case 48:
                  if (curChar == 65 && kind > 22)
                     kind = 22;
                  break;
               case 51:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAdd(52);
                  break;
               case 52:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAdd(53);
                  break;
               case 53:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(53, 54);
                  break;
               case 65:
                  if ((0x84000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 71:
                  if ((0x800020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 80:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(52, 81);
                  break;
               case 81:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAdd(82);
                  break;
               case 82:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(82);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 104 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   50, 51, 1, 0, 2, 61, 62, 63, 67, 68, 69, 73, 74, 75, 76, 77, 
   78, 79, 84, 96, 99, 100, 101, 102, 1, 0, 2, 76, 77, 78, 73, 74, 
   75, 67, 68, 69, 61, 62, 63, 3, 6, 8, 10, 12, 14, 15, 18, 92, 
   93, 94, 43, 45, 47, 48, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\54", null, "\56", null, null, null, null, null, null, null, null, null, 
null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x7ffffffL, 
};
static final long[] jjtoSkip = {
   0x78000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[104];
static private final int[] jjstateSet = new int[208];
static StringBuffer image;
static int jjimageLen;
static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public huracanesCompiladorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public huracanesCompiladorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 104; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         tokenImage = "";
      else
         tokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      tokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 12;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 1 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String aux = image.toString();

                aux = aux.replace(" ", "");

                matchedToken.image = aux;
         break;
      case 2 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                aux = image.toString();

                aux = aux.replace(" ", "");

                matchedToken.image = aux;
         break;
      case 3 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String[] separador;

                aux = image.toString();

                separador = aux.split("," , 2 );

                separador[0] = separador[0].replace(" ", "");

                if ( separador[0].isEmpty() )
                {
                        separador[0] = "N/A";
                }
                separador[1] = separador[1].replace(" ","");

                matchedToken.image = separador[0] + "," + separador[1];
         break;
      case 4 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                aux = image.toString();

                aux = aux.replace(" ", "");

                matchedToken.image = aux;
         break;
      case 5 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                aux = image.toString();

                aux = aux.replace(" ", "");

                if (aux.contains("S"))
                {
                        aux = aux.replace("S", "");
                        aux = "-" + aux;
                }

                aux = aux.replace("N", "");

                matchedToken.image = aux;
         break;
      case 6 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                aux = image.toString();

                aux = aux.replace(" ", "");

                if (aux.contains("W"))
                {
                        aux = aux.replace("W", "");
                        aux = "-" + aux;
                }

                aux = aux.replace("E", "");

                matchedToken.image = aux;
         break;
      case 7 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                aux = image.toString();

                aux = aux.replace(" ", "");

                if(aux.equals("-999,") )
                {
                        aux = "NULL,";
                }

                matchedToken.image = aux;
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() && 
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      case 25 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                             System.out.println("RECORDIDENT");
         break;
      case 26 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                              System.out.println("ESTADOSISTEMA");
         break;
      default : 
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}