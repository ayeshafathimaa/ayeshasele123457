package PrgNLP;

import com.tyss.optimize.common.util.*;
import com.tyss.optimize.nlp.util.*;
import com.tyss.optimize.nlp.util.annotation.*;

import net.bytebuddy.utility.RandomString;

import java.util.*;

import org.springframework.stereotype.Component;

@Component("LIC19437_PJT1010_PE_NLP40fe1ea5-f09d-4f49-9c95-49c17bdc2298")
public class Randomvaluestring implements Nlp {
    @InputParams({@InputParam(name = "Length", type = "java.lang.Integer")})
    @ReturnType(name = "RandomString", type = "java.lang.String")

      public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
        
          NlpResponseModel nlpResponseModel = new NlpResponseModel();
          Map<String, Object> programElementsInput = nlpRequestModel.getAttributes();
          Integer Len = (Integer) programElementsInput.get("Length");
         String str=null;
   
          try {
           // Your program element business logic starts here ...
             str=RandomString.make(Len);
              nlpResponseModel.setMessage("RandomString"+str);
              nlpResponseModel.setStatus(CommonConstants.pass);
              }
          catch(Exception e) {
           // Your program element Exception goes here ...
              nlpResponseModel.setMessage("Failed to GeneraterandomString");
              nlpResponseModel.setStatus(CommonConstants.fail);
              }

          // Your program element business logic ends here ...
          nlpResponseModel.getAttributes().put("RandomString", str);
          return nlpResponseModel;
      }

      @Override
      public List<String> getTestParameters() throws NlpException {
        List<String> params = new ArrayList<>();
        return params;
      }

      @Override
      public StringBuilder getTestCode() throws NlpException {
         StringBuilder sb = new StringBuilder();
        return sb;
      }
  } 