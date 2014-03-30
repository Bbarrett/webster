(ns directory
  (:import java.io.File))
  
(defn list-contents 
  "lists files, pre-sort"
  [directory]
   (println(.getName directory))
   (doseq [f (.listFiles directory)]
     (if (.isDirectory f)
       (print "dir : ")
       (println (.getName f)))))
     
(defn run-list 
  "Runs file list on given directory, usable from within any function"
  [directory]
  (list-contents (File. directory)))
 
(defn check-directory [directory]
 (if(.exists (as-file directory))
     (run-list directory)
     (println "directory not found")))
 
(defn filter-files [label]
  (filter #(.endsWith (str %) label)))

(defn get-labeled-files [directory label]
  (check-directory directory) 
  (filter-files label))


 




 



