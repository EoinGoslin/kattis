int[] finalOrder = new int[3];
        //Integer is the key and the String is the value
        HashMap<Integer, Integer> mynumMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Character> myletterMap = new HashMap<Integer, Character>();
        if(num1<num2&&num1<num3){
            mynumMap.put(1, num1);
            aUsed = true;
        } else if(num2<num1&&num2<num3){
            mynumMap.put(1, num2);
            bUsed = true;
        } else {
            mynumMap.put(1, num3);
            cUsed = true;
        }

        //smallest known

        int first = myMap.get(1);
        System.out.println(first);
        if(num1>num2&&num1>num3){
            myMap.put(3, num1);
        } else if(num2>num1&&num2>num3){
            myMap.put(3, num2);
        } else {
            myMap.put(3, num3);
        }

        //biggest known

        if(num1!=myMap.get(1)&&num1!=myMap.get(3)){
            myMap.put(2, num1);
        } else if(num2!=myMap.get(1)&&num2!=myMap.get(3)) {
            myMap.put(2, num2);
        } else {
            myMap.put(2, num3);
        }