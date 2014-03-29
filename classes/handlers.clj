(ns handlers
(:import java.io.File)
(:import java.text.SimpleDateFormat)
(:import java.nio.file.Files)
(require [clojure.java.io :as io]))

(def date (java.util.Date.))

(def file-labels
  {:javascript   ".js"
   :html         ".html"
   :css          ".css"
   :document     ".doc"})

(defn get-size [file]
  (let [file (File. file)]
     (let [byte-size (.length file)
        kb-size (* byte-size 1024)
        mb-size (* byte-size 1048576)]
       (println (.getName file) "is: "
       (println byte-size "bytes")
       (println kb-size "kb")
       (println mb-size "MB")))))
       
(defn format-date [date]
   (.format
      (java.text.SimpleDateFormat. "MM/dd/yyyy")date))
     
(defn check-date [file]
  (let [file (File. file)]
 (println"last-modified:"
   (format-date  (.lastModified file)))))
    
(defn check-file [file]
  (get-size file)
  (check-date file))

(defn copy-file [source-path dest-path]
  (io/copy (File. source-path) (File. dest-path)))

(defn make-directory 
 "Creates a directory to store project files." 
 [directory folder-name]
   (.mkdir (java.io.File. directory folder-name))
         (println "new extension" folder-name "added to" directory))





  
  
  

  
  


      



