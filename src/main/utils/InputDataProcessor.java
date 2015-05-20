package main.utils;

import java.util.Arrays;
import java.util.List;

import main.core.dto.Parameters;


public class InputDataProcessor {

    private static final int LINE_WITH_SIZES_NO = 0;
    private static final int LINE_WITH_WEIGHTS_NO = 1;
    private static final int LINE_WITH_PRICES_NO = 2;

    private static final int PACK_SIZE_POSITION = 0;
    private static final int ITEMS_AMOUNT_POSITION = 1;
    
    public Parameters processData(List<String> inputData) {
        
        Parameters parameters = new Parameters();
        
        String splitetFirstLine[] = inputData.get(LINE_WITH_SIZES_NO).split(" ");
        
        int backpackSize = Integer.valueOf(splitetFirstLine[PACK_SIZE_POSITION]);
        int itemsAmount = Integer.valueOf(splitetFirstLine[ITEMS_AMOUNT_POSITION]);
        
        parameters.setItemsAmount(itemsAmount);
        parameters.setPackSize(backpackSize);
        
        List<String> pricesList = Arrays.asList(inputData.get(LINE_WITH_PRICES_NO).split(","));
        parameters.setPrices(pricesList);
        
        List<String> sizesList = Arrays.asList(inputData.get(LINE_WITH_WEIGHTS_NO).split(","));
        parameters.setSizes(sizesList);
        
        return parameters;
    } 
    
}