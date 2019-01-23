package esl.compiler;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.compiler.PpExp.*;
// import static esl.Lists.*;
import static esl.compiler.Types.*;
import static esl.compiler.TypeCheck.*;
import static esl.compiler.ToJava.*;
import static esl.Displays.*;
import static esl.compiler.Strings.*;
import static esl.compiler.Warnings.*;
import static esl.compiler.MethodTransform.*;
public class Compiler {
  public static ESLVal getSelf() { return $null; }
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          

          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)").add(ESLVal.list(_v6)));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal t = $t;
            
            if($true.boolVal)
            stopAll.apply();
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
private static ESLVal moduleImports(ESLVal m) {
    
    {ESLVal _v1 = m;
      
      switch(_v1.termName) {
      case "Module": {ESLVal $7 = _v1.termRef(0);
        ESLVal $6 = _v1.termRef(1);
        ESLVal $5 = _v1.termRef(2);
        ESLVal $4 = _v1.termRef(3);
        ESLVal $3 = _v1.termRef(4);
        ESLVal $2 = _v1.termRef(5);
        ESLVal $1 = _v1.termRef(6);
        
        {ESLVal path = $7;
        
        {ESLVal name = $6;
        
        {ESLVal exports = $5;
        
        {ESLVal imports = $4;
        
        {ESLVal decs = $3;
        
        {ESLVal y = $2;
        
        {ESLVal defs = $1;
        
        return imports;
      }
      }
      }
      }
      }
      }
      }
      }
      default: return error(new ESLVal("case error at Pos(2338,2467)").add(ESLVal.list(_v1)));
    }
    }
  }
  private static ESLVal moduleImports = new ESLVal(new Function(new ESLVal("moduleImports"),null) { public ESLVal apply(ESLVal... args) { return moduleImports(args[0]); }});
  public static ESLVal compileFile(ESLVal sourceFile) {
    
    {ESLVal path = toPath(sourceFile);
      
      {ESLVal className = pathToJavaClassName(path);
      
      {ESLVal sourcePath = new ESLVal("src/").add(joinBy(new ESLVal(47),butlast.apply(path)).add(new ESLVal("/").add(className.add(new ESLVal(".java")))));
      
      {ESLVal package1 = pathToJavaPackage(path);
      
      if(sourcePath.ref("writeDate").less(sourceFile.ref("writeDate")).boolVal)
      return compileModule(sourcePath,package1,className,sourceFile);
      else
        return print.apply(new ESLVal("[ ").add(sourceFile.add(new ESLVal(" is up to date. ]"))));
    }
    }
    }
    }
  }
  public static ESLVal compileFile = new ESLVal(new Function(new ESLVal("compileFile"),null) { public ESLVal apply(ESLVal... args) { return compileFile(args[0]); }});
  public static ESLVal runFile(ESLVal sourceFile) {
    
    {ESLVal path = toPath(sourceFile);
      
      {ESLVal className = pathToJavaClassName(path);
      
      {ESLVal sourcePath = new ESLVal("src/").add(joinBy(new ESLVal(47),butlast.apply(path)).add(new ESLVal("/").add(className.add(new ESLVal(".java")))));
      
      {ESLVal package1 = pathToJavaPackage(path);
      
      return runModule(sourcePath,package1,className,sourceFile);
    }
    }
    }
    }
  }
  public static ESLVal runFile = new ESLVal(new Function(new ESLVal("runFile"),null) { public ESLVal apply(ESLVal... args) { return runFile(args[0]); }});
  public static ESLVal compileModule(ESLVal sourcePath,ESLVal package1,ESLVal name,ESLVal path) {
    
    {print.apply(new ESLVal("[ compile ").add(sourcePath.add(new ESLVal("]"))));
    return new Function(new ESLVal("try"),getSelf()) {
        public ESLVal apply(ESLVal... args) { 
          try { 
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            {ESLVal module = parse.apply(path);
              
              {ESLVal imports = moduleImports(module);
              
              {resetWarnings();
            typeCheckModule(path);
            {ESLVal untypedJModule = addMethodCalls(moduleToJava(module));
              
              {Lib.send(edb,"Edit",new ESLVal("JavaSource",sourcePath,name,ppJModule(name,package1,untypedJModule)));
            {{
              ESLVal _v2 = imports;
              while(_v2.isCons()) {
                ESLVal i = _v2.headVal;
                compileFile(i);
                _v2 = _v2.tailVal;}
            }
            return $null;}}
            }}
            }
            }
          }}.get();
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
  public static ESLVal compileModule = new ESLVal(new Function(new ESLVal("compileModule"),null) { public ESLVal apply(ESLVal... args) { return compileModule(args[0],args[1],args[2],args[3]); }});
  private static ESLVal runModule(ESLVal sourcePath,ESLVal package1,ESLVal name,ESLVal path) {
    
    {print.apply(new ESLVal("[ compile ").add(sourcePath.add(new ESLVal("]"))));
    return new Function(new ESLVal("try"),getSelf()) {
        public ESLVal apply(ESLVal... args) { 
          try { 
            return new SerializableSupplier<ESLVal>() { public ESLVal get() { 
            {ESLVal module = parse.apply(path);
              
              {ESLVal imports = moduleImports(module);
              
              {resetWarnings();
            typeCheckModule(path);
            {ESLVal untypedJModule = addMethodCalls(moduleToJava(module));
              
              {Lib.send(edb,"RunJava",sourcePath,name,ppJModule(name,package1,untypedJModule));
            {{
              ESLVal _v4 = imports;
              while(_v4.isCons()) {
                ESLVal i = _v4.headVal;
                compileFile(i);
                _v4 = _v4.tailVal;}
            }
            return $null;}}
            }}
            }
            }
          }}.get();
          } catch(ESLError $exception) {
            ESLVal $x = $exception.value;
            {ESLVal _v5 = $x;
        
        {ESLVal message = _v5;
        
        return print.apply(new ESLVal("Type Error: ").add(message));
      }
      }
          }
        }
      }.apply();}
  }
  private static ESLVal runModule = new ESLVal(new Function(new ESLVal("runModule"),null) { public ESLVal apply(ESLVal... args) { return runModule(args[0],args[1],args[2],args[3]); }});
public static void main(String[] args) {
    newActor(main,new ESLVal(new Actor())); 
  }
}