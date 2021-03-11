package Models;
/**
 * This is the parent class for any class that is going to make calls to the API.
 */

import API.ApiInterface;
import API.DatabaseApiTranslator;

public class Base{

    // Here we designate the Translator that we want to use. In this case, the OpenDatabaseAPITranslator.
    protected final static ApiInterface CasinoAPI = new DatabaseApiTranslator();

}
