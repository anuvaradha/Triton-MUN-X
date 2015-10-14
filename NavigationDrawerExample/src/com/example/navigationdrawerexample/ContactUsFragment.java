package com.example.navigationdrawerexample;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ContactUsFragment extends Fragment {
	
	private ListView mainListView ;  
	 private ArrayAdapter<String> listAdapter ;
	
	public ContactUsFragment(){
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_contactus, container, false);
        
        String[] committees = new String[] { "President: Marvin Andrade \n mondrade@ucsd.edu", "Secretary General: Megan Difley \n megan.difley@gmail.com", 
        		"Undersecretary General: Jamie Anderson \n jla003@ucsd.edu", "Vice President: Reilly Hurley \n reillyhurley@gmail.com", 
        		"Chief of Staff: Erin McKey \n emckey@ucsd.edu", "Director of Training: Reina Ishii \n ishiire2012@gmail.com", 
        		"Publicity-Internal: Lilia Stone \n listone@ucsd.edu", "Publicity-External: Ashraf Beshay \n abbeshay@ucsd.edu ", 
        		"Webmaster: Andrew Simon \n asimon@ucsd.edu", "Webmaster: Anusha Varadharajan \n anusha.varadharajan@gmail.com"};   
        
        ArrayList<String> committeeList = new ArrayList<String>();  
        committeeList.addAll( Arrays.asList(committees) ); 
        
        // Create ArrayAdapter using the committee list.  
        listAdapter = new ArrayAdapter<String>(getActivity(), R.layout.simplerow, committeeList); 
        
        mainListView = (ListView) rootView.findViewById( R.id.contactListView );

       mainListView.setAdapter( listAdapter );
        
        return rootView;
    }
 

}
