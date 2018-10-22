package esl;
import esl.lib.*;
import static esl.lib.Lib.*;
import static esl.Displays.*;
// import static esl.Lists.*;
import java.util.function.Supplier;
public class Excel {
  public static ESLVal getSelf() { return $null; }
  private static ESLVal round = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("round"),$one);
  private static ESLVal hasSuffix = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("hasSuffix"),new ESLVal(2));
  private static ESLVal trim = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("trim"),$one);
  private static ESLVal downcase = builtin.apply(new ESLVal("runtime.actors.Builtins"),new ESLVal("downcase"),$one);
  private static ESLVal cols = new ESLVal(4);
  private static ESLVal width = new ESLVal(350);
  private static ESLVal height = new ESLVal(550);
  private static ESLVal rowData = new ESLVal(new Function(new ESLVal("rowData"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal row = $args[0];
  {ESLVal _v42 = row;
        
        switch(_v42.termName) {
        case "XRow": {ESLVal $103 = _v42.termRef(0);
          
          {ESLVal cells = $103;
          
          return cells;
        }
        }
        default: return error(new ESLVal("case error at Pos(1028,1081)"));
      }
      }
    }
  });
  private static ESLVal floatValue = new ESLVal(new Function(new ESLVal("floatValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal c = $args[0];
  {ESLVal _v41 = c;
        
        switch(_v41.termName) {
        case "XFloat": {ESLVal $102 = _v41.termRef(0);
          
          {ESLVal f = $102;
          
          return f;
        }
        }
      case "XBlank": {
          return new ESLVal(0.0);
        }
        default: return error(new ESLVal("case error at Pos(1119,1177)"));
      }
      }
    }
  });
  private static ESLVal readWorkbook = builtin.apply(new ESLVal("test.ExcelReader"),new ESLVal("readWorkbook"),$one);
  private static ESLVal workbookRows = new ESLVal(new Function(new ESLVal("workbookRows"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal w = $args[0];
  {ESLVal _v40 = w;
        
        switch(_v40.termName) {
        case "XWorkbook": {ESLVal $97 = _v40.termRef(0);
          
          if($97.isCons())
          {ESLVal $98 = $97.head();
            ESLVal $99 = $97.tail();
            
            switch($98.termName) {
            case "XSheet": {ESLVal $101 = $98.termRef(0);
              ESLVal $100 = $98.termRef(1);
              
              {ESLVal n = $101;
              
              {ESLVal rows = $100;
              
              {ESLVal sheets = $99;
              
              return rows;
            }
            }
            }
            }
            default: return error(new ESLVal("case error at Pos(1414,1503)"));
          }
          }
        else if($97.isNil())
          return error(new ESLVal("case error at Pos(1414,1503)"));
        else return error(new ESLVal("case error at Pos(1414,1503)"));
        }
        default: return error(new ESLVal("case error at Pos(1414,1503)"));
      }
      }
    }
  });
  private static ESLVal downcaseWorkbook = new ESLVal(new Function(new ESLVal("downcaseWorkbook"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal w = $args[0];
  {ESLVal _v36 = w;
        
        switch(_v36.termName) {
        case "XWorkbook": {ESLVal $92 = _v36.termRef(0);
          
          {ESLVal sheets = $92;
          
          return new ESLVal("XWorkbook",map.apply(new ESLVal(new Function(new ESLVal("fun6431"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal s = $args[0];
          {ESLVal _v37 = s;
                
                switch(_v37.termName) {
                case "XSheet": {ESLVal $94 = _v37.termRef(0);
                  ESLVal $93 = _v37.termRef(1);
                  
                  {ESLVal name = $94;
                  
                  {ESLVal rows = $93;
                  
                  return new ESLVal("XSheet",name,map.apply(new ESLVal(new Function(new ESLVal("fun6432"),getSelf()) {
                    public ESLVal apply(ESLVal... $args) {
                      ESLVal r = $args[0];
                  {ESLVal _v38 = r;
                        
                        switch(_v38.termName) {
                        case "XRow": {ESLVal $95 = _v38.termRef(0);
                          
                          {ESLVal cells = $95;
                          
                          return new ESLVal("XRow",map.apply(new ESLVal(new Function(new ESLVal("fun6433"),getSelf()) {
                            public ESLVal apply(ESLVal... $args) {
                              ESLVal c = $args[0];
                          {ESLVal _v39 = c;
                                
                                switch(_v39.termName) {
                                case "XStr": {ESLVal $96 = _v39.termRef(0);
                                  
                                  {ESLVal t = $96;
                                  
                                  return new ESLVal("XStr",downcase.apply(t));
                                }
                                }
                                default: {ESLVal _v68 = _v39;
                                  
                                  return _v68;
                                }
                              }
                              }
                            }
                          }),cells));
                        }
                        }
                        default: return error(new ESLVal("case error at Pos(1810,2075)"));
                      }
                      }
                    }
                  }),rows));
                }
                }
                }
                default: return error(new ESLVal("case error at Pos(1670,2092)"));
              }
              }
            }
          }),sheets));
        }
        }
        default: return error(new ESLVal("case error at Pos(1546,2106)"));
      }
      }
    }
  });
  private static ESLVal readFile = new ESLVal(new Function(new ESLVal("readFile"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal file = $args[0];
  {ESLVal _v35 = file;
        
        switch(_v35.termName) {
        case "File": {ESLVal $91 = _v35.termRef(0);
          ESLVal $90 = _v35.termRef(1);
          
          {ESLVal year = $91;
          
          {ESLVal path = $90;
          
          return new ESLVal("NSSData",year,workbookRows.apply(downcaseWorkbook.apply(readWorkbook.apply(path))));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(2285,2409)"));
      }
      }
    }
  });
  private static ESLVal readFiles = new ESLVal(new Function(new ESLVal("readFiles"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal files = $args[0];
  return map.apply(readFile,files);
    }
  });
  private static ESLVal programmeFiles = ESLVal.list(new ESLVal("File",new ESLVal(2014),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2014.xlsx")),new ESLVal("File",new ESLVal(2015),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2015.xlsx")),new ESLVal("File",new ESLVal(2016),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2016.xlsx")),new ESLVal("File",new ESLVal(2017),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2017.xlsx")),new ESLVal("File",new ESLVal(2018),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_programmes_2018.xlsx")));
  private static ESLVal jacsFiles = ESLVal.list(new ESLVal("File",new ESLVal(2014),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2014.xlsx")),new ESLVal("File",new ESLVal(2015),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2015.xlsx")),new ESLVal("File",new ESLVal(2016),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2016.xlsx")),new ESLVal("File",new ESLVal(2017),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2017.xlsx")),new ESLVal("File",new ESLVal(2018),new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/NSS/Aston Histories/NSS_jacs_2018.xlsx")));
  private static ESLVal dlheFile = new ESLVal("/Users/clarkt1/Dropbox/Aston_Files/Metrics/DLHE/EAS_DLHE_2013_2017.xlsx");
  private static ESLVal nextYear = new ESLVal(2019);
  private static ESLVal nextYearSchoolTarget = new ESLVal(85);
  private static ESLVal nextYearAstonTarget = new ESLVal(90);
  private static ESLVal aston = new ESLVal("Aston University (10007759)");
  private static ESLVal population = new ESLVal("population (headcount)");
  private static ESLVal respondents = new ESLVal("number of respondents (headcount)");
  private static ESLVal programmeData = readFiles.apply(programmeFiles);
  private static ESLVal jacsData = readFiles.apply(jacsFiles);
  private static ESLVal dlheData = workbookRows.apply(downcaseWorkbook.apply(readWorkbook.apply(dlheFile)));
  private static ESLVal downcaseJACS = new ESLVal(new Function(new ESLVal("downcaseJACS"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal j = $args[0];
  {ESLVal _v32 = j;
        
        switch(_v32.termName) {
        case "JACS": {ESLVal $89 = _v32.termRef(0);
          ESLVal $88 = _v32.termRef(1);
          ESLVal $87 = _v32.termRef(2);
          
          {ESLVal code = $89;
          
          {ESLVal name = $88;
          
          {ESLVal programmes = $87;
          
          return new ESLVal("JACS",code,downcase.apply(name),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v33 = $qualArg;
                
                {ESLVal ns = _v33;
                
                return ESLVal.list(ESLVal.list(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal _v67 = $args[0];
                {ESLVal _v34 = _v67;
                      
                      {ESLVal n = _v34;
                      
                      return ESLVal.list(ESLVal.list(downcase.apply(n)));
                    }
                    }
                  }
                }).map(ns).flatten().flatten()));
              }
              }
            }
          }).map(programmes).flatten().flatten());
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4159,4318)"));
      }
      }
    }
  });
  private static ESLVal schoolTarget = new ESLVal("GLine",$nil,new ESLVal("EAS Target"),map.apply(new ESLVal(new Function(new ESLVal("fun6434"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v31 = d;
        
        switch(_v31.termName) {
        case "File": {ESLVal $86 = _v31.termRef(0);
          ESLVal $85 = _v31.termRef(1);
          
          {ESLVal year = $86;
          
          {ESLVal s = $85;
          
          return new ESLVal("LPoint",$nil,year,new ESLVal(82));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4442,4514)"));
      }
      }
    }
  }),jacsFiles).add(ESLVal.list(new ESLVal("LPoint",$nil,nextYear,nextYearSchoolTarget))));
  private static ESLVal astonTarget = new ESLVal("GLine",$nil,new ESLVal("Aston Target"),map.apply(new ESLVal(new Function(new ESLVal("fun6435"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v30 = d;
        
        switch(_v30.termName) {
        case "File": {ESLVal $84 = _v30.termRef(0);
          ESLVal $83 = _v30.termRef(1);
          
          {ESLVal year = $84;
          
          {ESLVal s = $83;
          
          return new ESLVal("LPoint",$nil,year,new ESLVal(90));
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(4706,4778)"));
      }
      }
    }
  }),jacsFiles).add(ESLVal.list(new ESLVal("LPoint",$nil,nextYear,nextYearAstonTarget))));
  private static ESLVal programmesByJACSCode = map.apply(downcaseJACS,ESLVal.list(new ESLVal("JACS",new ESLVal(25),new ESLVal("Chemistry"),ESLVal.list(ESLVal.list(new ESLVal("BSc Chemistry")),ESLVal.list(new ESLVal("BSc Applied Chemistry")))),new ESLVal("JACS",new ESLVal(26),new ESLVal("Physics & Astronomy"),ESLVal.list(ESLVal.list(new ESLVal("BSc Applied Physics")))),new ESLVal("JACS",new ESLVal(32),new ESLVal("Mathematics & Statistics"),ESLVal.list(ESLVal.list(new ESLVal("BSc Business and Mathematics")),ESLVal.list(new ESLVal("BSc Mathematics with Computing")),ESLVal.list(new ESLVal("BSc Mathematics")),ESLVal.list(new ESLVal("Mathematics Major WITH Economics Minor")))),new ESLVal("JACS",new ESLVal(35),new ESLVal("Computer Science"),ESLVal.list(ESLVal.list(new ESLVal("BEng Electronic Engineering and Computer Science")),ESLVal.list(new ESLVal("BSc Computing for Business")),ESLVal.list(new ESLVal("BSc Computing Science and Mathematics")),ESLVal.list(new ESLVal("BSc Mathematics with Computing")),ESLVal.list(new ESLVal("BSc Multimedia Computing")),ESLVal.list(new ESLVal("MEng Software Engineering")),ESLVal.list(new ESLVal("BSc Digital and Technology Solutions (Business Analyst) - Capgemini")),ESLVal.list(new ESLVal("BSc Digital and Technology Solutions (Software Engineer) - Capgemini")),ESLVal.list(new ESLVal("MEng Electronic Engineering and Computer Science (Fast-track)")),ESLVal.list(new ESLVal("BSc Computing Science")))),new ESLVal("JACS",new ESLVal(36),new ESLVal("General Engineering"),ESLVal.list(ESLVal.list(new ESLVal("BEng Design Engineering")))),new ESLVal("JACS",new ESLVal(37),new ESLVal("Mechanical Production & Manufacturing Engineering"),ESLVal.list(ESLVal.list(new ESLVal("BEng Electromechanical Engineering")),ESLVal.list(new ESLVal("BEng Professional Engineering (Power Systems)")),ESLVal.list(new ESLVal("BSc Product Design and Management")),ESLVal.list(new ESLVal("MEng Mechanical Engineering")),ESLVal.list(new ESLVal("BSc Transport Product Design")),ESLVal.list(new ESLVal("BSc Industrial Product Design")),ESLVal.list(new ESLVal("BEng Mechanical Engineering")))),new ESLVal("JACS",new ESLVal(40),new ESLVal("Electronic & Electrical Engineering"),ESLVal.list(ESLVal.list(new ESLVal("BEng Communications Engineering")),ESLVal.list(new ESLVal("BEng Electrical & Electronic Engineering")),ESLVal.list(new ESLVal("BEng Electronic Engineering and Computer Science")),ESLVal.list(new ESLVal("BEng in Biomedical Engineering")),ESLVal.list(new ESLVal("MEng in Biomedical Engineering")),ESLVal.list(new ESLVal("MEng Electrical and Electronic Engineering (Fast-Track)")),ESLVal.list(new ESLVal("MEng Electronic Engineering and Computer Science (Fast-track)")),ESLVal.list(new ESLVal("BEng Electrical & Electronic Engineering")))),new ESLVal("JACS",new ESLVal(42),new ESLVal("Chemical Process & Energy Engineering"),ESLVal.list(ESLVal.list(new ESLVal("BEng Chemical Engineering")),ESLVal.list(new ESLVal("MEng Chemical Engineering")))),new ESLVal("JACS",new ESLVal(46),new ESLVal("Others in Technology"),ESLVal.list(ESLVal.list(new ESLVal("BSc Logistics and Operations Management")),ESLVal.list(new ESLVal("BSc Logistics with Supply Chain Management")),ESLVal.list(new ESLVal("BSc Logistics with Transport Management")),ESLVal.list(new ESLVal("BSc Logistics with Purchasing Management")))),new ESLVal("JACS",new ESLVal(48),new ESLVal("Building"),ESLVal.list(ESLVal.list(new ESLVal("BSc Construction Project Management"))))));
  private static ESLVal programmeByJACSTable = new ESLVal("Table",ESLVal.list(new ESLVal("Prop",new ESLVal("border"),new ESLVal("1px solid-black"))),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal $qualArg = $args[0];
  {ESLVal _v29 = $qualArg;
        
        switch(_v29.termName) {
        case "JACS": {ESLVal $82 = _v29.termRef(0);
          ESLVal $81 = _v29.termRef(1);
          ESLVal $80 = _v29.termRef(2);
          
          {ESLVal code = $82;
          
          {ESLVal name = $81;
          
          {ESLVal ps = $80;
          
          return ESLVal.list(ESLVal.list(new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",$nil,new ESLVal("HTML",code.add(new ESLVal("")))),new ESLVal("Data",$nil,new ESLVal("HTML",name)),new ESLVal("Data",$nil,new ESLVal("HTML",flatten.apply(ps).add(new ESLVal(""))))))));
        }
        }
        }
        }
        default: {ESLVal _0 = _v29;
          
          return ESLVal.list();
        }
      }
      }
    }
  }).map(programmesByJACSCode).flatten().flatten());
  private static ESLVal instructions = new ESLVal("<center> <h1> NSS Results for EAS </center> </h1>").add(new ESLVal("<br>").add(new ESLVal("The following tables show the NSS results for the School of Engineering and Applied Sciences ").add(new ESLVal("grouped by JACS code. An individual programme must meet the NSS threshold of 10 students or 50% ").add(new ESLVal("return to report in the NSS. The same applies to the groupings by JACS code. The data shows the ").add(new ESLVal("results for the previous 5 years where this is known. The results for each grouping are organised ").add(new ESLVal("as a chart showing the overall satisfaction for programmes and JACS code, and then the results ").add(new ESLVal("for each NSS question. Note that the questions changed in 2017 and the titles of each graph shows ").add(new ESLVal("the pre-2017 question and the post-2017 question. The labels attached to the nodes ").add(new ESLVal("are population:returned where the population is the total number of students that could possibly ").add(new ESLVal("return, and returned is the number that actually completed the NSS.").add(new ESLVal("<br>"))))))))))));
  private static ESLVal dlheInstructions = new ESLVal("<center> <h1> DLHE Results for EAS </center> </h1>").add(new ESLVal("<br>").add(new ESLVal("The following tables show the DLHE results for the School of Engineering and Applied Sciences ").add(new ESLVal("grouped by JACS code. In each case the table shows the % of graduates in both graduate-level employment ").add(new ESLVal("any form of employment or further study.").add(new ESLVal("<br>"))))));
  private static ESLVal questions = ESLVal.list(ESLVal.list(new ESLVal("Overall Satisfaction"),new ESLVal("Overall satisfaction")),ESLVal.list(new ESLVal("1. Staff are good at explaining things.")),ESLVal.list(new ESLVal("2. Staff have made the subject interesting.")),ESLVal.list(new ESLVal("4. The course is intellectually stimulating."),new ESLVal("3. The course is intellectually stimulating.")),ESLVal.list(new ESLVal("5. The criteria used in marking have been clear in advance."),new ESLVal("8. The criteria used in marking have been clear in advance.")),ESLVal.list(new ESLVal("6. Assessment arrangements and marking have been fair."),new ESLVal("9. Marking and assessment has been fair.")),ESLVal.list(new ESLVal("7. Feedback on my work has been prompt."),new ESLVal("10. Feedback on my work has been timely.\n")),ESLVal.list(new ESLVal("8. I have received detailed comments on my work."),new ESLVal("11. I have received helpful comments on my work.")),ESLVal.list(new ESLVal("10. I have received sufficient advice and support with my studies."),new ESLVal("13. I have received sufficient advice and guidance in relation to my course.")),ESLVal.list(new ESLVal("11. I have been able to contact staff when I needed to."),new ESLVal("12. I have been able to contact staff when I needed to.")),ESLVal.list(new ESLVal("12. Good advice was available when I needed to make study choices."),new ESLVal("14. Good advice was available when I needed to make study choices on my course.")),ESLVal.list(new ESLVal("13. The timetable works efficiently as far as my activities are concerned."),new ESLVal("16. The timetable works efficiently for me.")),ESLVal.list(new ESLVal("14. Any changes in the course or teaching have been communicated effectively."),new ESLVal("17. Any changes in the course or teaching have been communicated effectively.")),ESLVal.list(new ESLVal("15. The course is well organised and is running smoothly."),new ESLVal("15. The course is well organised and running smoothly.")),ESLVal.list(new ESLVal("16. The library resources and services are good enough for my needs."),new ESLVal("19. The library resources (e.g. books, online services and learning spaces) have supported my learning well.")),ESLVal.list(new ESLVal("17. I have been able to access general IT resources when I needed to."),new ESLVal("18. The IT resources and facilities provided have supported my learning well.")),ESLVal.list(new ESLVal("18. I have been able to access specialised equipment, facilities or rooms when I needed to."),new ESLVal("20. I have been able to access course-specific resources (e.g. equipment, facilities, software, collections) when I needed to.")));
  private static ESLVal getLine = new ESLVal(new Function(new ESLVal("getLine"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal question = $args[1];
  ESLVal results = $args[2];
  {ESLVal points = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal $qualArg = $args[0];
          {ESLVal _v27 = $qualArg;
                
                switch(_v27.termName) {
                case "NSSData": {ESLVal $76 = _v27.termRef(0);
                  ESLVal $75 = _v27.termRef(1);
                  
                  {ESLVal year = $76;
                  
                  {ESLVal rows = $75;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("LPoint",$nil,year,score.apply(year,name,question,rows))));
                }
                }
                }
                default: {ESLVal _0 = _v27;
                  
                  return ESLVal.list();
                }
              }
              }
            }
          }).map(results).flatten().flatten();
        
        return new ESLVal("GLine",$nil,new ESLVal("").add(name),new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v28 = $qualArg;
              
              switch(_v28.termName) {
              case "LPoint": {ESLVal $79 = _v28.termRef(0);
                ESLVal $78 = _v28.termRef(1);
                ESLVal $77 = _v28.termRef(2);
                
                {ESLVal ps = $79;
                
                {ESLVal x = $78;
                
                {ESLVal y = $77;
                
                return ESLVal.list((y.gre($zero).boolVal) ? (ESLVal.list(new ESLVal("LPoint",ESLVal.list(new ESLVal("Prop",new ESLVal("label"),lineLabel.apply(name,x,results))),x,y))) : ($nil));
              }
              }
              }
              }
              default: {ESLVal _0 = _v28;
                
                return ESLVal.list();
              }
            }
            }
          }
        }).map(points).flatten().flatten());
      }
    }
  });
  private static ESLVal lineLabel = new ESLVal(new Function(new ESLVal("lineLabel"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal year = $args[1];
  ESLVal results = $args[2];
  {ESLVal _v26 = results;
        
        if(_v26.isCons())
        {ESLVal $71 = _v26.head();
          ESLVal $72 = _v26.tail();
          
          switch($71.termName) {
          case "NSSData": {ESLVal $74 = $71.termRef(0);
            ESLVal $73 = $71.termRef(1);
            
            {ESLVal y = $74;
            
            {ESLVal rows = $73;
            
            {ESLVal _v64 = $72;
            
            if(y.eql(year).boolVal)
            return pop.apply(name,rows).add(new ESLVal(":").add(responds.apply(name,rows)));
            else
              {ESLVal d = $71;
                
                {ESLVal _v65 = $72;
                
                return lineLabel.apply(name,year,_v65);
              }
              }
          }
          }
          }
          }
          default: {ESLVal d = $71;
            
            {ESLVal _v66 = $72;
            
            return lineLabel.apply(name,year,_v66);
          }
          }
        }
        }
      else if(_v26.isNil())
        return error(new ESLVal("case error at Pos(11400,11623)"));
      else return error(new ESLVal("case error at Pos(11400,11623)"));
      }
    }
  });
  private static ESLVal score = new ESLVal(new Function(new ESLVal("score"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal year = $args[0];
  ESLVal name = $args[1];
  ESLVal question = $args[2];
  ESLVal rows = $args[3];
  {ESLVal nameCell = map.apply(new ESLVal(new Function(new ESLVal("fun6436"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal s = $args[0];
          return new ESLVal("XStr",downcase.apply(s));
            }
          }),name);
        
        {ESLVal questionCell = map.apply(new ESLVal(new Function(new ESLVal("fun6437"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal s = $args[0];
          return new ESLVal("XStr",downcase.apply(s));
            }
          }),question);
        
        {ESLVal namedScores = select.apply(new ESLVal(new Function(new ESLVal("fun6438"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal r = $args[0];
          return exists.apply(new ESLVal(new Function(new ESLVal("fun6439"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal c = $args[0];
                return member.apply(c,nameCell);
                  }
                }),rowData.apply(r));
            }
          }),rows);
        
        if(namedScores.eql($nil).boolVal)
        return $zero;
        else
          {ESLVal agreeScores = select.apply(new ESLVal(new Function(new ESLVal("fun6440"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal r = $args[0];
              return exists.apply(new ESLVal(new Function(new ESLVal("fun6441"),getSelf()) {
                      public ESLVal apply(ESLVal... $args) {
                        ESLVal c = $args[0];
                    return c.eql(new ESLVal("XStr",new ESLVal("% agree")));
                      }
                    }),rowData.apply(r));
                }
              }),namedScores);
            
            if(agreeScores.eql($nil).boolVal)
            return $zero;
            else
              {ESLVal i = indexOfColumn.apply(questionCell,rows);
                
                {ESLVal _v25 = nth.apply(rowData.apply(head.apply(agreeScores)),i);
                
                switch(_v25.termName) {
                case "XFloat": {ESLVal $70 = _v25.termRef(0);
                  
                  {ESLVal f = $70;
                  
                  return round.apply(f);
                }
                }
                default: {ESLVal x = _v25;
                  
                  return $zero;
                }
              }
              }
              }
          }
      }
      }
      }
    }
  });
  private static ESLVal pop = new ESLVal(new Function(new ESLVal("pop"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal rows = $args[1];
  {ESLVal nameCell = map.apply(new ESLVal(new Function(new ESLVal("fun6442"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal s = $args[0];
          return new ESLVal("XStr",downcase.apply(s));
            }
          }),name);
        
        {ESLVal popRows = rowsContaining.apply(new ESLVal("XStr",population),rowsContainingAny.apply(nameCell,rows));
        
        if(popRows.eql(ESLVal.list()).boolVal)
        return error(new ESLVal("no population row: ").add(rowsContainingAny.apply(nameCell,rows)));
        else
          {ESLVal _v24 = nth.apply(rowData.apply(head.apply(popRows)),new ESLVal(4));
            
            switch(_v24.termName) {
            case "XFloat": {ESLVal $69 = _v24.termRef(0);
              
              {ESLVal n = $69;
              
              return round.apply(n).add(new ESLVal(""));
            }
            }
            default: {ESLVal c = _v24;
              
              return error(new ESLVal("no float for population"));
            }
          }
          }
      }
      }
    }
  });
  private static ESLVal responds = new ESLVal(new Function(new ESLVal("responds"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal rows = $args[1];
  {ESLVal nameCell = map.apply(new ESLVal(new Function(new ESLVal("fun6443"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal s = $args[0];
          return new ESLVal("XStr",downcase.apply(s));
            }
          }),name);
        
        {ESLVal popRows = rowsContaining.apply(new ESLVal("XStr",respondents),rowsContainingAny.apply(nameCell,rows));
        
        if(popRows.eql(ESLVal.list()).boolVal)
        return error(new ESLVal("no respondents row"));
        else
          {ESLVal _v23 = nth.apply(rowData.apply(head.apply(popRows)),new ESLVal(4));
            
            switch(_v23.termName) {
            case "XFloat": {ESLVal $68 = _v23.termRef(0);
              
              {ESLVal n = $68;
              
              return round.apply(n).add(new ESLVal(""));
            }
            }
            default: {ESLVal c = _v23;
              
              return error(new ESLVal("no responds row"));
            }
          }
          }
      }
      }
    }
  });
  private static ESLVal rowsContaining = new ESLVal(new Function(new ESLVal("rowsContaining"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cell = $args[0];
  ESLVal rows = $args[1];
  return select.apply(new ESLVal(new Function(new ESLVal("fun6444"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal r = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun6445"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal c = $args[0];
              return c.eql(cell);
                }
              }),rowData.apply(r));
          }
        }),rows);
    }
  });
  private static ESLVal rowsContainingAny = new ESLVal(new Function(new ESLVal("rowsContainingAny"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal cells = $args[0];
  ESLVal rows = $args[1];
  return select.apply(new ESLVal(new Function(new ESLVal("fun6446"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal r = $args[0];
        return exists.apply(new ESLVal(new Function(new ESLVal("fun6447"),getSelf()) {
                public ESLVal apply(ESLVal... $args) {
                  ESLVal c = $args[0];
              return member.apply(c,cells);
                }
              }),rowData.apply(r));
          }
        }),rows);
    }
  });
  private static ESLVal indexOfColumn = new ESLVal(new Function(new ESLVal("indexOfColumn"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v63 = $args[0];
  ESLVal _v62 = $args[1];
  {ESLVal questionRows = select.apply(new ESLVal(new Function(new ESLVal("fun6448"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal r = $args[0];
          return exists.apply(new ESLVal(new Function(new ESLVal("fun6449"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal c = $args[0];
                return member.apply(c,_v63);
                  }
                }),rowData.apply(r));
            }
          }),_v62);
        
        {ESLVal question = select.apply(new ESLVal(new Function(new ESLVal("fun6450"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal c = $args[0];
          return exists.apply(new ESLVal(new Function(new ESLVal("fun6451"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal r = $args[0];
                return member.apply(c,rowData.apply(r));
                  }
                }),questionRows);
            }
          }),_v63);
        
        if(question.eql($nil).boolVal)
        return error(new ESLVal("cannot find question ").add(_v63.add(new ESLVal("in ").add(_v62))));
        else
          return indexOf.apply(head.apply(question),rowData.apply(head.apply(questionRows)));
      }
      }
    }
  });
  private static ESLVal isPercentAgree = new ESLVal(new Function(new ESLVal("isPercentAgree"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal r = $args[0];
  {ESLVal _v22 = r;
        
        switch(_v22.termName) {
        case "XRow": {ESLVal $62 = _v22.termRef(0);
          
          if($62.isCons())
          {ESLVal $63 = $62.head();
            ESLVal $64 = $62.tail();
            
            if($64.isCons())
            {ESLVal $65 = $64.head();
              ESLVal $66 = $64.tail();
              
              switch($65.termName) {
              case "XStr": {ESLVal $67 = $65.termRef(0);
                
                switch($67.strVal) {
                case "% agree": {ESLVal x = $63;
                  
                  {ESLVal rest = $66;
                  
                  return $true;
                }
                }
                default: {ESLVal _v55 = _v22;
                  
                  return $false;
                }
              }
              }
              default: {ESLVal _v56 = _v22;
                
                return $false;
              }
            }
            }
          else if($64.isNil())
            {ESLVal _v57 = _v22;
              
              return $false;
            }
          else {ESLVal _v58 = _v22;
              
              return $false;
            }
          }
        else if($62.isNil())
          {ESLVal _v59 = _v22;
            
            return $false;
          }
        else {ESLVal _v60 = _v22;
            
            return $false;
          }
        }
        default: {ESLVal _v61 = _v22;
          
          return $false;
        }
      }
      }
    }
  });
  private static ESLVal nameMatch = new ESLVal(new Function(new ESLVal("nameMatch"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal name = $args[0];
  ESLVal names = $args[1];
  return exists.apply(new ESLVal(new Function(new ESLVal("fun6452"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal _v54 = $args[0];
        return member.apply(name,_v54);
          }
        }),names);
    }
  });
  private static ESLVal graphs = new ESLVal(new Function(new ESLVal("graphs"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v52 = $args[0];
  ESLVal _v51 = $args[1];
  ESLVal _v50 = $args[2];
  {ESLVal _v21 = _v52;
        
        if(_v21.isCons())
        {ESLVal $60 = _v21.head();
          ESLVal $61 = _v21.tail();
          
          {ESLVal q = $60;
          
          {ESLVal _v53 = $61;
          
          return graphs.apply(_v53,_v51,_v50).cons(graph.apply(q,_v51,_v50));
        }
        }
        }
      else if(_v21.isNil())
        return $nil;
      else return error(new ESLVal("case error at Pos(15238,15394)"));
      }
    }
  });
  private static ESLVal graph = new ESLVal(new Function(new ESLVal("graph"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal question = $args[0];
  ESLVal jacsName = $args[1];
  ESLVal programmes = $args[2];
  {ESLVal lines = map.apply(new ESLVal(new Function(new ESLVal("fun6453"),getSelf()) {
            public ESLVal apply(ESLVal... $args) {
              ESLVal names = $args[0];
          return getLine.apply(names,question,programmeData);
            }
          }),programmes);
        ESLVal jacsLine = getLine.apply(ESLVal.list(jacsName),question,jacsData);
        ESLVal astonLine = getLine.apply(ESLVal.list(aston),question,jacsData);
        
        {print.apply(new ESLVal("jacs line ").add(jacsName.add(new ESLVal(" = ").add(jacsLine))));
      return new ESLVal("LineGraph",ESLVal.list(),new ESLVal("").add(question),new ESLVal("Year"),new ESLVal("Score"),new ESLVal(700),new ESLVal(700),lines.cons(jacsLine).cons(astonLine));}
      }
    }
  });
  private static ESLVal transformTable = new ESLVal(new Function(new ESLVal("transformTable"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal table = $args[0];
  {ESLVal _v20 = table;
        
        switch(_v20.termName) {
        case "Table": {ESLVal $42 = _v20.termRef(0);
          ESLVal $41 = _v20.termRef(1);
          
          if($41.isCons())
          {ESLVal $43 = $41.head();
            ESLVal $44 = $41.tail();
            
            switch($43.termName) {
            case "Row": {ESLVal $46 = $43.termRef(0);
              ESLVal $45 = $43.termRef(1);
              
              if($45.isCons())
              {ESLVal $47 = $45.head();
                ESLVal $48 = $45.tail();
                
                switch($47.termName) {
                case "Data": {ESLVal $50 = $47.termRef(0);
                  ESLVal $49 = $47.termRef(1);
                  
                  switch($49.termName) {
                  case "LineGraph": {ESLVal $57 = $49.termRef(0);
                    ESLVal $56 = $49.termRef(1);
                    ESLVal $55 = $49.termRef(2);
                    ESLVal $54 = $49.termRef(3);
                    ESLVal $53 = $49.termRef(4);
                    ESLVal $52 = $49.termRef(5);
                    ESLVal $51 = $49.termRef(6);
                    
                    if($48.isCons())
                    {ESLVal $58 = $48.head();
                      ESLVal $59 = $48.tail();
                      
                      return error(new ESLVal("case error at Pos(15930,16381)"));
                    }
                  else if($48.isNil())
                    {ESLVal tps = $42;
                      
                      {ESLVal rps = $46;
                      
                      {ESLVal dps = $50;
                      
                      {ESLVal gps = $57;
                      
                      {ESLVal title = $56;
                      
                      {ESLVal x = $55;
                      
                      {ESLVal y = $54;
                      
                      {ESLVal w = $53;
                      
                      {ESLVal h = $52;
                      
                      {ESLVal lines = $51;
                      
                      {ESLVal rows = $44;
                      
                      return new ESLVal("Table",tps,doubleUpRows.apply(rows,cols).cons(new ESLVal("Row",rps,ESLVal.list(new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("colspan"),new ESLVal("").add(cols))),new ESLVal("LineGraph",gps,title,x,y,cols.mul(width),height,lines.cons(astonTarget).cons(schoolTarget)))))));
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                    }
                  else return error(new ESLVal("case error at Pos(15930,16381)"));
                  }
                  default: return error(new ESLVal("case error at Pos(15930,16381)"));
                }
                }
                default: return error(new ESLVal("case error at Pos(15930,16381)"));
              }
              }
            else if($45.isNil())
              return error(new ESLVal("case error at Pos(15930,16381)"));
            else return error(new ESLVal("case error at Pos(15930,16381)"));
            }
            default: return error(new ESLVal("case error at Pos(15930,16381)"));
          }
          }
        else if($41.isNil())
          return error(new ESLVal("case error at Pos(15930,16381)"));
        else return error(new ESLVal("case error at Pos(15930,16381)"));
        }
        default: return error(new ESLVal("case error at Pos(15930,16381)"));
      }
      }
    }
  });
  private static ESLVal doubleUpRows = new ESLVal(new Function(new ESLVal("doubleUpRows"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal _v49 = $args[0];
  ESLVal _v48 = $args[1];
  if(length.apply(_v49).gre(_v48).boolVal)
        return doubleUpRows.apply(drop.apply(_v49,_v48),_v48).cons(mergeRows.apply(take.apply(_v49,_v48)));
        else
          return ESLVal.list(new ESLVal("Row",$nil,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
              public ESLVal apply(ESLVal... $args) {
                ESLVal $qualArg = $args[0];
            {ESLVal _v19 = $qualArg;
                  
                  {ESLVal i = _v19;
                  
                  return ESLVal.list(ESLVal.list(new ESLVal("Data",$nil,new ESLVal("HTML",new ESLVal("")))));
                }
                }
              }
            }).map(length.apply(_v49).to(_v48)).flatten().flatten())).cons(mergeRows.apply(_v49));
    }
  });
  private static ESLVal mergeRows = new ESLVal(new Function(new ESLVal("mergeRows"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal rows = $args[0];
  return new ESLVal("Row",$nil,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v18 = $qualArg;
              
              {ESLVal r = _v18;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Data",$nil,setLineGraphTitleSize.apply(setLineGraphSize.apply(dataValue.apply(head.apply(tableRowData.apply(r))),width,height),new ESLVal(8)))));
            }
            }
          }
        }).map(rows).flatten().flatten());
    }
  });
  private static ESLVal setLineGraphSize = new ESLVal(new Function(new ESLVal("setLineGraphSize"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal g = $args[0];
  ESLVal w = $args[1];
  ESLVal h = $args[2];
  {ESLVal _v17 = g;
        
        switch(_v17.termName) {
        case "LineGraph": {ESLVal $40 = _v17.termRef(0);
          ESLVal $39 = _v17.termRef(1);
          ESLVal $38 = _v17.termRef(2);
          ESLVal $37 = _v17.termRef(3);
          ESLVal $36 = _v17.termRef(4);
          ESLVal $35 = _v17.termRef(5);
          ESLVal $34 = _v17.termRef(6);
          
          {ESLVal ps = $40;
          
          {ESLVal title = $39;
          
          {ESLVal x = $38;
          
          {ESLVal y = $37;
          
          {ESLVal ow = $36;
          
          {ESLVal oh = $35;
          
          {ESLVal lines = $34;
          
          return new ESLVal("LineGraph",ps,title,x,y,w,h,lines);
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17096,17234)"));
      }
      }
    }
  });
  private static ESLVal setLineGraphTitleSize = new ESLVal(new Function(new ESLVal("setLineGraphTitleSize"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal g = $args[0];
  ESLVal size = $args[1];
  {ESLVal _v16 = g;
        
        switch(_v16.termName) {
        case "LineGraph": {ESLVal $33 = _v16.termRef(0);
          ESLVal $32 = _v16.termRef(1);
          ESLVal $31 = _v16.termRef(2);
          ESLVal $30 = _v16.termRef(3);
          ESLVal $29 = _v16.termRef(4);
          ESLVal $28 = _v16.termRef(5);
          ESLVal $27 = _v16.termRef(6);
          
          {ESLVal ps = $33;
          
          {ESLVal title = $32;
          
          {ESLVal x = $31;
          
          {ESLVal y = $30;
          
          {ESLVal w = $29;
          
          {ESLVal h = $28;
          
          {ESLVal lines = $27;
          
          return new ESLVal("LineGraph",ps.cons(new ESLVal("Prop",new ESLVal("titleSize"),size.add(new ESLVal("")))),title,x,y,w,h,lines);
        }
        }
        }
        }
        }
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17298,17460)"));
      }
      }
    }
  });
  private static ESLVal dataValue = new ESLVal(new Function(new ESLVal("dataValue"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal d = $args[0];
  {ESLVal _v15 = d;
        
        switch(_v15.termName) {
        case "Data": {ESLVal $26 = _v15.termRef(0);
          ESLVal $25 = _v15.termRef(1);
          
          {ESLVal ps = $26;
          
          {ESLVal e = $25;
          
          return e;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17510,17574)"));
      }
      }
    }
  });
  private static ESLVal tableRowData = new ESLVal(new Function(new ESLVal("tableRowData"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal r = $args[0];
  {ESLVal _v14 = r;
        
        switch(_v14.termName) {
        case "Row": {ESLVal $24 = _v14.termRef(0);
          ESLVal $23 = _v14.termRef(1);
          
          {ESLVal ps = $24;
          
          {ESLVal ds = $23;
          
          return ds;
        }
        }
        }
        default: return error(new ESLVal("case error at Pos(17635,17709)"));
      }
      }
    }
  });
  private static ESLVal dlheTable = new ESLVal(new Function(new ESLVal("dlheTable"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal("Table",$nil,ESLVal.list(new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("colspan"),new ESLVal("").add(cols))),new ESLVal("HTML",dlheInstructions))))).add(doubleUpRows.apply(new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal $qualArg = $args[0];
        {ESLVal _v13 = $qualArg;
              
              {ESLVal c = _v13;
              
              return ESLVal.list(ESLVal.list(new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",$nil,c)))));
            }
            }
          }
        }).map(dlheCharts.apply()).flatten().flatten(),cols)));
    }
  });
  private static ESLVal dlheCharts = new ESLVal(new Function(new ESLVal("dlheCharts"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return reject.apply(new ESLVal(new Function(new ESLVal("fun6454"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal g = $args[0];
        {ESLVal _v11 = g;
              
              switch(_v11.termName) {
              case "LineGraph": {ESLVal $17 = _v11.termRef(0);
                ESLVal $16 = _v11.termRef(1);
                ESLVal $15 = _v11.termRef(2);
                ESLVal $14 = _v11.termRef(3);
                ESLVal $13 = _v11.termRef(4);
                ESLVal $12 = _v11.termRef(5);
                ESLVal $11 = _v11.termRef(6);
                
                if($11.isCons())
                {ESLVal $18 = $11.head();
                  ESLVal $19 = $11.tail();
                  
                  {ESLVal _v45 = _v11;
                  
                  return $false;
                }
                }
              else if($11.isNil())
                {ESLVal ps = $17;
                  
                  {ESLVal name = $16;
                  
                  {ESLVal x = $15;
                  
                  {ESLVal y = $14;
                  
                  {ESLVal w = $13;
                  
                  {ESLVal h = $12;
                  
                  return $true;
                }
                }
                }
                }
                }
                }
              else {ESLVal _v46 = _v11;
                  
                  return $false;
                }
              }
              default: {ESLVal _v47 = _v11;
                
                return $false;
              }
            }
            }
          }
        }),map.apply(new ESLVal(new Function(new ESLVal("fun6455"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal j = $args[0];
        {ESLVal _v12 = j;
              
              switch(_v12.termName) {
              case "JACS": {ESLVal $22 = _v12.termRef(0);
                ESLVal $21 = _v12.termRef(1);
                ESLVal $20 = _v12.termRef(2);
                
                {ESLVal code = $22;
                
                {ESLVal name = $21;
                
                {ESLVal programmes = $20;
                
                return new ESLVal("LineGraph",$nil,name,new ESLVal("year"),new ESLVal("%"),width,height,dlheLines.apply(programmes,dlheData));
              }
              }
              }
              }
              default: return error(new ESLVal("case error at Pos(18258,18436)"));
            }
            }
          }
        }),programmesByJACSCode));
    }
  });
  private static ESLVal dlheLines = new ESLVal(new Function(new ESLVal("dlheLines"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal programmes = $args[0];
  ESLVal d = $args[1];
  return flatten.apply(map.apply(new ESLVal(new Function(new ESLVal("fun6456"),getSelf()) {
          public ESLVal apply(ESLVal... $args) {
            ESLVal pnames = $args[0];
        {ESLVal names = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal $qualArg = $args[0];
                {ESLVal _v9 = $qualArg;
                      
                      {ESLVal n = _v9;
                      
                      return ESLVal.list(ESLVal.list(new ESLVal("XStr",n)));
                    }
                    }
                  }
                }).map(pnames).flatten().flatten();
              
              {ESLVal rows = rowsContainingAny.apply(names,d);
              ESLVal removeAll0 = new ESLVal(new Function(new ESLVal("removeAll0"),getSelf()) {
                  public ESLVal apply(ESLVal... $args) {
                    ESLVal points = $args[0];
                return reject.apply(new ESLVal(new Function(new ESLVal("fun6457"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal l = $args[0];
                      {ESLVal _v10 = l;
                            
                            switch(_v10.termName) {
                            case "LPoint": {ESLVal $10 = _v10.termRef(0);
                              ESLVal $9 = _v10.termRef(1);
                              ESLVal $8 = _v10.termRef(2);
                              
                              {ESLVal ps = $10;
                              
                              {ESLVal x = $9;
                              
                              {ESLVal y = $8;
                              
                              return y.eql($zero);
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(18826,18878)"));
                          }
                          }
                        }
                      }),points);
                  }
                });
              
              if(rows.eql(ESLVal.list()).boolVal)
              return ESLVal.list();
              else
                {ESLVal values = rowData.apply(head.apply(rows));
                  
                  return ESLVal.list(new ESLVal("GLine",$nil,new ESLVal("Graduate Level Employment ").add(pnames.add(new ESLVal(""))),removeAll0.apply(ESLVal.list(new ESLVal("LPoint",$nil,new ESLVal(2013),round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(13)))))),new ESLVal("LPoint",$nil,new ESLVal(2014),round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(10)))))),new ESLVal("LPoint",$nil,new ESLVal(2015),round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(7)))))),new ESLVal("LPoint",$nil,new ESLVal(2016),round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(4)))))),new ESLVal("LPoint",$nil,new ESLVal(2017),round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,$one)))))))),new ESLVal("GLine",$nil,new ESLVal("In Employment of Further Study ").add(pnames.add(new ESLVal(""))),removeAll0.apply(ESLVal.list(new ESLVal("LPoint",$nil,new ESLVal(2013),new ESLVal(100).sub(round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(14))))))),new ESLVal("LPoint",$nil,new ESLVal(2014),new ESLVal(100).sub(round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(11))))))),new ESLVal("LPoint",$nil,new ESLVal(2015),new ESLVal(100).sub(round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(8))))))),new ESLVal("LPoint",$nil,new ESLVal(2016),new ESLVal(100).sub(round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(5))))))),new ESLVal("LPoint",$nil,new ESLVal(2017),new ESLVal(100).sub(round.apply(new ESLVal(100.0).mul(floatValue.apply(nth.apply(values,new ESLVal(2)))))))))));
                }
            }
            }
          }
        }),programmes));
    }
  });
  private static ESLVal mergeTables = new ESLVal(new Function(new ESLVal("mergeTables"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      ESLVal t1 = $args[0];
  ESLVal t2 = $args[1];
  {ESLVal _v8 = t1;
        ESLVal _v7 = t2;
        
        switch(_v8.termName) {
        case "Table": {ESLVal $5 = _v8.termRef(0);
          ESLVal $4 = _v8.termRef(1);
          
          switch(_v7.termName) {
          case "Table": {ESLVal $7 = _v7.termRef(0);
            ESLVal $6 = _v7.termRef(1);
            
            {ESLVal ps1 = $5;
            
            {ESLVal rows1 = $4;
            
            {ESLVal ps2 = $7;
            
            {ESLVal rows2 = $6;
            
            return new ESLVal("Table",ps1,rows1.add(rows2));
          }
          }
          }
          }
          }
          default: return error(new ESLVal("case error at Pos(20616,20795)"));
        }
        }
        default: return error(new ESLVal("case error at Pos(20616,20795)"));
      }
      }
    }
  });
  // static ESLVal edb = null;
  public static ESLVal main = new ESLVal(new Function(new ESLVal("main"),getSelf()) {
    public ESLVal apply(ESLVal... $args) {
      return new ESLVal(new BehaviourAdapter(true,getSelf(),new ESLVal("main")) {
          
          public ESLVal handle(ESLVal $m) {{ESLVal _v6 = $m;
            
            return error(new ESLVal("case error at Pos(0,0)"));
          }}
          public ESLVal get(String name) {
            switch(name) {
              
              default: throw new Error("ref illegal " + self + "." + name);
            }
          }
        public void handleTime(ESLVal $t) {
          {ESLVal n = $t;
            
            if($true.boolVal)
            new Function(new ESLVal("try"),getSelf()) {
              public ESLVal apply(ESLVal... args) { 
                try { 
                  return ((Supplier<ESLVal>)() -> { 
                  {{ESLVal tables = map.apply(new ESLVal(new Function(new ESLVal("fun6458"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal j = $args[0];
                      {ESLVal _v1 = j;
                            
                            switch(_v1.termName) {
                            case "JACS": {ESLVal $3 = _v1.termRef(0);
                              ESLVal $2 = _v1.termRef(1);
                              ESLVal $1 = _v1.termRef(2);
                              
                              {ESLVal code = $3;
                              
                              {ESLVal title = $2;
                              
                              {ESLVal programmes = $1;
                              
                              {print.apply(title);
                            return new ESLVal("Table",$nil,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                                public ESLVal apply(ESLVal... $args) {
                                  ESLVal $qualArg = $args[0];
                              {ESLVal _v2 = $qualArg;
                                    
                                    {ESLVal _v43 = _v2;
                                    
                                    return ESLVal.list(ESLVal.list(new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",$nil,_v43)))));
                                  }
                                  }
                                }
                              }).map(graphs.apply(questions,title,programmes)).flatten().flatten());}
                            }
                            }
                            }
                            }
                            default: return error(new ESLVal("case error at Pos(21016,21339)"));
                          }
                          }
                        }
                      }),programmesByJACSCode);
                    
                    {ESLVal _v44 = new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal $qualArg = $args[0];
                      {ESLVal _v3 = $qualArg;
                            
                            {ESLVal table = _v3;
                            
                            return ESLVal.list(ESLVal.list(transformTable.apply(table)));
                          }
                          }
                        }
                      }).map(tables).flatten().flatten();
                    
                    {ESLVal nsstable = new ESLVal("Table",$nil,new ESLVal(new Function(new ESLVal("qual"),getSelf()) {
                        public ESLVal apply(ESLVal... $args) {
                          ESLVal $qualArg = $args[0];
                      {ESLVal _v4 = $qualArg;
                            
                            {ESLVal t = _v4;
                            
                            return ESLVal.list(ESLVal.list(new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",$nil,t)))));
                          }
                          }
                        }
                      }).map(_v44).flatten().flatten());
                    
                    Lib.send(edb,"Show",new ESLVal("results"),mergeTables.apply(new ESLVal("Table",$nil,ESLVal.list(new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("colspan"),new ESLVal("").add(cols))),new ESLVal("HTML",instructions)))),new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("colspan"),new ESLVal("").add(cols))),programmeByJACSTable))),new ESLVal("Row",$nil,ESLVal.list(new ESLVal("Data",ESLVal.list(new ESLVal("Prop",new ESLVal("colspan"),new ESLVal("").add(cols))),nsstable))))),dlheTable.apply()));
                  }
                  }
                  }
                  return stopAll.apply();}
                }).get();
                } catch(ESLError $exception) {
                  ESLVal $x = $exception.value;
                  {ESLVal _v5 = $x;
              
              {ESLVal x = _v5;
              
              return print.apply(x);
            }
            }
                }
              }
            }.apply();
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