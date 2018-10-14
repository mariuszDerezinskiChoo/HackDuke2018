     public Task(String Name, float Upper, float Lower, float ORDER, int PRIORITY, STRING DATE ){
            name = Name;
            upper= Upper;
            lower= Lower;
            order= ORDER;
            priority= PRIORITY;
            date= DATE;
     public String getName( ) {
      return name;
   }
   public float getUpper( ) {
      return upper;
   }
   public float getLower( ) {
      return name;
   }
   public float getOrder( ) {
      return order;
   }

public int getPriority( ) {
      return priority;
   }
public String getDate( ) {
      return date;
   }

        }

    }
public Task[] getTask()
{
int i= 0;
String array[] = new String[cursor.getCount()];
SQLiteDatabase sqLiteDatabase = sqLiteDBHelper.getWritableDatabase();
Cursor cursor = sqLiteDatabase.query(SQLiteDBHelper.SCHEDULE_TABLE, null, null, null, null, null, null);
for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
    
    array[i]= cursor.getString(0);
    
    i++
}




}

    

    
    }