package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.PpExp.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.TypeCheck.*;
import static esl.compiler.ToJava.*;
import static esl.Displays.*;
import static esl.compiler.DynamicVars.*;
import static esl.compiler.Strings.*;
import java.util.function.Supplier;
public class Compiler {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal moduleImports = new ESLVal(new Function(new ESLVal("moduleImports"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal m = $args[0];
  {ESLVal _v1 = m;
        
        switch(_v1.termName) {
        case "Module": {ESLVal $1 = _v1.termRef(0);
          ESLVal $2 = _v1.termRef(1);
          ESLVal $3 = _v1.termRef(2);
          ESLVal $4 = _v1.termRef(3);
          ESLVal $5 = _v1.termRef(4);
          ESLVal $6 = _v1.termRef(5);
          ESLVal $7 = _v1.termRef(6);
          
          {ESLVal path = $1;
          
          {ESLVal name = $2;
          
          {ESLVal exports = $3;
          
          {ESLVal imports = $4;
          
          {ESLVal x = $5;
          
          {ESLVal y = $6;
          
          {ESLVal defs = $7;
          
          return imports;
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2445,2569)"));
      }
      }
    }
  });
  public static ESLVal compileFile = new ESLVal(new Function(new ESLVal("compileFile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal sourceFile = $args[0];
  {ESLVal path = toPath.apply(sourceFile);
        
        {ESLVal className = pathToJavaClassName.apply(path);
        
        {ESLVal sourcePath = new ESLVal("src/").add(joinBy.apply(new ESLVal(47),butlast.apply(path)).add(new ESLVal("/").add(className.add(new ESLVal(".java")))));
        
        {ESLVal package1 = pathToJavaPackage.apply(path);
        
        if(sourcePath.ref("writeDate").less(sourceFile.ref("writeDate")).boolVal)
        return compileModule.apply(sourcePath,package1,className,sourceFile);
        else
          return print.apply(new ESLVal("[ ").add(sourceFile.add(new ESLVal(" is up to date. ]"))));
      }
      }
      }
      }
    }
  });
  public static ESLVal compileModule = new ESLVal(new Function(new ESLVal("compileModule"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal sourcePath = $args[0];
  ESLVal package1 = $args[1];
  ESLVal name = $args[2];
  ESLVal path = $args[3];
  {print.apply(new ESLVal("[ compile ").add(sourcePath.add(new ESLVal("]"))));
      return new Function(new ESLVal("try"),getSelf()) {
          public ESLVal apply(ESLVal... args) { 
            try { 
              return ((Supplier<ESLVal>)() -> { 
              {ESLVal module = parse.apply(path);
                
                {ESLVal imports = moduleImports.apply(module);
                
                {typeCheckModule.apply(path);
              {ESLVal untypedJModule = moduleToJava.apply(module);
                
                {dynamicVarsJModule.apply(untypedJModule);
              Lib.send(edb,"Edit",new ESLVal("JavaSource",sourcePath,name,ppJModule.apply(name,package1,untypedJModule)));
              {{
                ESLVal _v2 = imports;
                while(_v2.isCons()) {
                  ESLVal i = _v2.headVal;
                  compileFile.apply(i);
                  _v2 = _v2.tailVal;}
              }
              return $null;}}
              }}
              }
              }
            }).get();
            } catch(ESLError $exception) {
              ESLVal $x = $exception.value;
              {ESLVal _v3 = $x;
          
          {ESLVal message = _v3;
          
          return print.apply(new ESLVal("Type Error: ").add(message));
        }
        }
            }
          }
        }.apply();}
    }
  });
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v4 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal t = $t;
            
            if($true.boolVal)
            {print.apply(new ESLVal("Start of system"));
            compileFile.apply(new ESLVal("esl/lists.esl"));
            compileFile.apply(new ESLVal("esl/tables.esl"));
            compileFile.apply(new ESLVal("esl/compiler/strings.esl"));
            compileFile.apply(new ESLVal("esl/compiler/compiler.esl"));
            compileFile.apply(new ESLVal("esl/compiler/ppExp.esl"));
            compileFile.apply(new ESLVal("esl/compiler/typeCheck.esl"));
            compileFile.apply(new ESLVal("esl/compiler/toJava.esl"));
            compileFile.apply(new ESLVal("esl/compiler/dynamicVars.esl"));
            compileFile.apply(new ESLVal("esl/compiler/cases.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/search.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/main.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/qsort.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/mapReduce.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/termites.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/philosophers.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/segregation.esl"));
            compileFile.apply(new ESLVal("esl/tutorial/shop.esl"));
            print.apply(new ESLVal("DONE"));
            stopAll.apply();}
            else
              {}
          }
        }
        public ESLVal init() {
            return $null;
          }
        });
    }
  });
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}