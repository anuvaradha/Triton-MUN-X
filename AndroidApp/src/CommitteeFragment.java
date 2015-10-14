package com.example.navigationdrawerexample;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CommitteeFragment extends Fragment {
	
	 private ListView mainListView ;  
	 private ArrayAdapter<String> listAdapter ;
	
	public CommitteeFragment() {
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_committee, container, false);
        
        String[] committees = new String[] { "1st DISEC", "WHO", "UNDP", "UNESCO", "SC", "NATO"};    
        ArrayList<String> committeeList = new ArrayList<String>();  
        committeeList.addAll( Arrays.asList(committees) ); 
        
        // Create ArrayAdapter using the committee list.  
        listAdapter = new ArrayAdapter<String>(getActivity(), R.layout.simplerow, committeeList); 
        
        mainListView = (ListView) rootView.findViewById( R.id.mainListView );

       mainListView.setAdapter( listAdapter );
       
       mainListView.setOnItemClickListener(new OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position,
                   long id) {
        	   
        	   switch(position)
        	   {
        	   	case 0:
        	   	{
        	   		AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create(); 
        	   		alertDialog.setTitle(Html.fromHtml("<font color='#0EDE906'>1st DISEC</font>"));
        	   		alertDialog.setMessage(Html.fromHtml("<font color='#44F0DC'> With the invention of unmanned aerial "
        	   				+ "vehicles, a new era of warfare has commenced.  Due to their recent emergence on "
        	   				+ "the battlefield, UAVs – or drones – do not have as many regulations as their "
        	   				+ "manned counterparts.  The 1st Disarmament and International Security Committee "
        	   				+ "convene to discuss how to set standards for these new weapons platforms. <br> <br> "
        	   				+ "Chair: Andrew Muse-Fisher <br>  "
        	   				+ "ViceChair: James Hsu <br> Speaker:</font> <br> <a href=\'https://sdmun.herokuapp.com"
        	   				+ "/assets/bgs/ScooterMuse-Fischer-DISEC-FinalCopy-569f8aa51483bab42380491987c2885b.pdf"
        	   				+ "\'>Topic Guide</a>"));
        	   		alertDialog.show(); 
        	   	 	break;
        	   	}
        	  
        	   	case 1:
        	   	{
        		   AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create(); 
        		   alertDialog.setTitle(Html.fromHtml("<font color='#EDE906'>WHO</font>"));
        		   alertDialog.setMessage(Html.fromHtml("<font color='#44F0DC'>"
        		   		+ "While First World nations rejoice at their abundance, least "
        		   		+ "developed nations struggle for subsistence.  With over 925 million "
        		   		+ "malnourished individuals in dozens of developing nations, the World "
        		   		+ "Health Organization convenes on November 1st  2014 to discuss "
        		   		+ "malnutrition in Least Developed Countries.<br> <br> "
        		   		+ "Chair: Emily Lu <br> "
        		   		+ "ViceChair: Sarah Min <br> Speaker:</font> <br> <a href=\'https://sdmun.herokuapp.com/assets/bgs/EmilyLu-WHO-"
        		   		+ "FinalCopy-3926ccd634c4027391780b67a35ce4a8.pdf\'>Topic Guide</a>"));
        		   alertDialog.show(); 
        		   break;
        	   	}
        	   	
        	   	case 2:
        	   	{
        	   		AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create(); 
         		    alertDialog.setTitle(Html.fromHtml("<font color='#EDE906'>UNDP</font>"));
         		    alertDialog.setMessage(Html.fromHtml("<font color='#44F0DC'>Since the start of civil conflict, over 3 million "
         		    		+ "Syrian refugees have fled for their safety.  These refugees face immense struggles in obtaining food, "
         		    		+ "shelter, education, and work.  The UN Development Program convenes on November 1st 2014 to discuss the "
         		    		+ "matter of developmental assistance to Syrian refugees <br> <br>"
         		    		+ "Chair: Carla Diot <br>"
         		    		+ " ViceChair:  <br> Speaker: </font> <br> <a href=\'https://sdmun.herokuapp.com/"
         		    		+ "assets/bgs/CarlaDiot-UNDP-FinalCopy-6474d42d43041325bdcaa2a8c4782efe.pdf\'>Topic Guide</a>"));
         		    alertDialog.show();
         			break;
        	   	}
        	   
        	   	case 3: 
        	   	{
        	   		AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create(); 
         		    alertDialog.setTitle(Html.fromHtml("<font color='#EDE906'>UNESCO</font>"));
         		    alertDialog.setMessage(Html.fromHtml("<font color='#44F0DC'> "
         		    		+ "UNESCO has attempted to improve the conditions and the accessibility "
         		    		+ "to education for all peoples of the international.  UNESCO convenes on "
         		    		+ "November 1st, 2014 to discuss inclusive education for all individuals. <br> <br> "
         		    		+ "Chair: Reina Ishii <br> ViceChair: Lilia Stone"
         		    		+ " <br> Speaker: </font> <br> <a href=\'https://sdmun.herokuapp.com/assets/bgs/ReinaIshii-UNESCO-"
         		    		+ "FinalCopy-4e897e04c9d7e85f1cab2abd89458920.pdf\'>Topic Guide</a>"));
         		    alertDialog.show();
         			break;
        	   	}
        	   	
        	   	case 4: 
        	   	{
        	   		AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create(); 
         		    alertDialog.setTitle(Html.fromHtml("<font color='#EDE906'>SC</font>"));
         		    alertDialog.setMessage(Html.fromHtml("<font color='#44F0DC'>"
         		    		+ "Given the evolving rapidly advancing nature of technology, "
         		    		+ "governments are facing cybersecurity concerns on a constant basis.  "
         		    		+ "Successful interception of computer systems can cripple a nation’s "
         		    		+ "financial and military sectors.  The international community convenes "
         		    		+ "on November 1st, 2014 to discuss cyber security and terrorism. <br> <br> "
         		    		+ "Chair: Ashraf Beshay <br> ViceChair: Ben Salter"
         		    		+ " <br> Speaker: Professor Schneider </font> <br> <a href=\'https://sdmun.herokuapp.com/assets/bgs/"
         		    		+ "AshrafBeshay-SecurityCouncil-FinalCopy-6e3f874fd06111aee2863cc89c75fa58.pdf\'>Topic Guide</a>"));
         		    alertDialog.show();
         			break;
        	   	}
        	   	
        	   	case 5:
        	   	{
        	   		AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create(); 
         		    alertDialog.setTitle(Html.fromHtml("<font color='#EDE906'>NATO</font>"));
         		    alertDialog.setMessage(Html.fromHtml("<font color='#44F0DC'>Following the "
         		    		+ "annexation of Crimea, Ukraine faced full rebel insurrection on its "
         		    		+ "easternmost cities.  Since civil conflict commenced, an airliner has"
         		    		+ " been downed by the eastern militia armed with Russian weaponry.  "
         		    		+ "NATO members convene on November 1st, 2014 to discuss methods"
         		    		+ " to secure Ukraine’s unstable borders. <br> <br>"
         		    		+ "Chair: Peyton Stever <br> ViceChair: Gor Sargsyan"
         		    		+ " <br> Speaker: Jace Owi </font> <br> <a href=\'https://sdmun.herokuapp.com/assets/bgs/PeytonStever-NATO-"
         		    		+ "FinalCopy-ae81e46973c92d993411401eaaa847f5.pdf\'>Topic Guide</a>"));
         		    alertDialog.show();
         			break;
        	   	}
        	   }  
           }
       });
 
       return rootView;
    }

}
