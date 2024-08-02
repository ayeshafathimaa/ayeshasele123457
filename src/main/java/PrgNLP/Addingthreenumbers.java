package PrgNLP;

import com.tyss.optimize.common.util.*;
import com.tyss.optimize.nlp.util.*;
import com.tyss.optimize.nlp.util.annotation.*;
import java.util.*;

import org.springframework.stereotype.Component;

@Component("LIC19437_PJT1010_PE_NLPf0172dfa-149e-4ad5-98ae-8e48e13b22f1")
public class Addingthreenumbers implements Nlp {
    @InputParams({@InputParam(name = "Number 1", type = "java.lang.Integer"), @InputParam(name = "Number 2", type = "java.lang.Integer"),@InputParam(name = "Number 3", type = "java.lang.Integer")})
    @ReturnType(name = "Sum of Three numbers", type = "java.lang.Integer")

      public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
        
          NlpResponseModel nlpResponseModel = new NlpResponseModel();
          Map<String, Object> programElementsInput = nlpRequestModel.getAttributes();
          Integer num1 = (Integer) programElementsInput.get("Number 1");
          Integer num2 = (Integer) programElementsInput.get("Number 2");
          Integer num3 = (Integer) programElementsInput.get("Number 3");
          int returnValue=0;

          try {
           // Your program element business logic starts here ...
              returnValue=num1+num2+num3;
              nlpResponseModel.setMessage("Added three numbers");
              nlpResponseModel.setStatus(CommonConstants.pass);
              }
          catch(Exception e) {
           // Your program element Exception goes here ...
              nlpResponseModel.setMessage("Failed to add numbers");
              nlpResponseModel.setStatus(CommonConstants.fail);
              }

          // Your program element business logic ends here ...
          nlpResponseModel.getAttributes().put("Sum of Three numbers", returnValue);
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