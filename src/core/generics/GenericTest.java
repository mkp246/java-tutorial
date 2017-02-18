package core.generics;

import java.util.*;

public class GenericTest {
    public static void main(String[] args) {
        Slot<String> stringSlot = new Slot<String>();
        stringSlot.setKey("::");
        System.out.println(stringSlot.getKey());


        List<ClubMember> clubMembers = new ArrayList<ClubMember>();
        clubMembers.add(new ClubMember("mika",182));
        clubMembers.add(new ClubMember("ron",132));
        clubMembers.add(new ClubMember("kalki",157));
        clubMembers.add(new ClubMember("joel",196));

        System.out.println(clubMembers);
        Collections.sort(clubMembers);
        System.out.println(clubMembers);
        Collections.sort(clubMembers, new Comparator<ClubMember>() {
            @Override
            public int compare(ClubMember o1, ClubMember o2) {
                return - o1.compareTo(o2);
            }
        });
        System.out.println(clubMembers);

        ClubMember wanted = new ClubMember("name", 182);
        int index = Collections.binarySearch(clubMembers, wanted);
        if(index >=0 ){
            System.out.println("person found at index : " + index);
            System.out.println(clubMembers.get(index).toString());
        } else {
            System.out.println("not found");
        }
    }
}
