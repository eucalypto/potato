(require 'package)
(add-to-list 'package-archives '("melpa" . "http://melpa.milkbox.net/packages/"))
(package-initialize)
(require 'auto-complete)
(require 'auto-complete-config)
(ac-config-default)




(global-set-key (kbd "C-c n") 'comment-or-uncomment-region)
;; (global-set-key (kbd "C-c u") 'uncomment-region)

(if window-system
	(set-frame-size (selected-frame) 80 60))



;; automatically enables "electric-pair-mode" in shell-script buffers
;; this way you don't have to select "Sh-Script"->;; "Insert braces and 
;; quotes in pairs"
(add-hook 'sh-mode-hook 'electric-pair-mode)

;; but I want to disable autocompletion of heredocs when I just type
;; "<<". Because this is annoying when trying to use herestrings "<<<
;; 'string'"
(add-hook 'sh-mode-hook
          (lambda ()
            (sh-electric-here-document-mode -1)))



;; Load CEDET.
;; See cedet/common/cedet.info for configuration details.
;; IMPORTANT: For Emacs >= 23.2, you must place this *before* any
;; CEDET component (including EIEIO) gets activated by another 
;; package (Gnus, auth-source, ...).
;;(load-file "~/Dropbox/emacs/cedet-1.1/common/cedet.el")

;; Enable EDE (Project Management) features
;;(semantic-mode 1)
;;(global-ede-mode 1)

;; Enable SRecode (Template management) minor-mode.
;;(global-srecode-minor-mode 1)



;; Enabling Semantic (code-parsing, smart completion) features
;; Select one of the following:

;; * This enables the database and idle reparse engines
;;(semantic-load-enable-minimum-features)

;; * This enables some tools useful for coding, such as summary mode,
;;   imenu support, and the semantic navigator
;;(semantic-load-enable-code-helpers)

;; * This enables even more coding tools such as intellisense mode,
;;   decoration mode, and stickyfunc mode (plus regular code helpers)
;; (semantic-load-enable-gaudy-code-helpers)

;; * This enables the use of Exuberant ctags if you have it installed.
;;   If you use C++ templates or boost, you should NOT enable it.
;; (semantic-load-enable-all-exuberent-ctags-support)
;;   Or, use one of these two types of support.
;;   Add support for new languages only via ctags.
;; (semantic-load-enable-primary-exuberent-ctags-support)
;;   Add support for using ctags as a backup parser.
;; (semantic-load-enable-secondary-exuberent-ctags-support)


;;*********************************
;; ECB:
;;(add-to-list 'load-path "~/Dropbox/emacs/ecb")
;;(require 'ecb)


;;(require 'auto-complete)
;;(add-to-list 'ac-dictionary-directories "/usr/share/auto-complete/dict/")
;;(require 'auto-complete-config)
;;(ac-config-default)
;;(require 'auto-complete)
;;(add-to-list 'ac-dictionary-directories "/usr/share/auto-complete/dict/")
;;(require 'auto-complete-config)
;;(ac-config-default)
;;Sets thecursor to white, because auto-complete fucks it when
;; having a black background
;;(set-cursor-color "white")
 

;; in C mode, delete hungrily
(setq c-hungry-delete-key t)

;; spaces instead of tabs by default
(setq-default indent-tabs-mode nil)
;;nil
(setq-default tab-width 2)

;; To let emacs show the column number:
(setq column-number-mode t)


;;Uhrzeit anzeigen lassen
;; (display-time)
;; (setq display-time-24hr-format t)

;;(add-hook 'LaTeX-mode-hook 'turn-on-auto-fill)

;;(add-hook 'LaTeX-mode-hook 'turn-on-reftex)
;;(setq reftex-plug-into-AUCTeX t)
;;(setq reftex-extra-bindings t)
;;(setq reftex-bibpath-environment-variables '("/home/viktor/latex/bibtex"))

;;(setq line-move-visual nil)

;;Dafür da, dass am Bildende umgebrochen 
;;(global-visual-line-mode 1)

;;Weiss-Schwarz statt Schwarz-Weiss
;; (set-background-color "black")
;; (set-foreground-color "white")

;;Zeilen automatisch umbrechen
;;(add-hook 'text-mode-hook 'turn-on-auto-fill)

;;Die Scrollbar enfernen
(toggle-scroll-bar -1)

;;Dafür, dass die Toolbar deaktiviert ist:
(tool-bar-mode -1)

;;For Auctex < 11.82 exchange ";;" in the following 2 lines
;;(require 'tex-site)
;;(load "auctex.el" nil t t)
;;(setq TeX-auto-save t)
;;(setq TeX-parse-self t)
;;(setq TeX-PDF-mode t) ;; .pdf statt .dvi per default
;;(add-hook 'LaTeX-mode-hook (lambda ()(TeX-fold-mode 1)))

;; aspell ist besser als ispell
;; Zeile auskommentieren, falls nicht installiert:
(setq-default ispell-program-name "aspell")
(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(ansi-color-names-vector ["#212526" "#ff4b4b" "#b4fa70" "#fce94f" "#729fcf" "#ad7fa8" "#8cc4ff" "#eeeeec"])
 '(column-number-mode t)
 '(custom-enabled-themes (quote (wombat)))
 '(delete-selection-mode nil)
 '(display-time-mode t)
 '(ecb-options-version "2.40")
;; '(epg-gpg-home-directory "/home/pcl302/papara/.gnupg/")
 '(inhibit-startup-screen t)
 '(mark-even-if-inactive t)
 '(scroll-bar-mode (quote right))
 '(send-mail-function (quote mailclient-send-it))
 '(show-paren-mode t)
 '(tool-bar-mode nil))


;; ;; Enable Yasnippet
;; (add-to-list 'load-path "~/.emacs.d/elpa/yasnippet-0.8.0")
(require 'yasnippet)
(yas-global-mode 1)


(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(default ((t (:family "Inconsolata" :foundry "unknown" :slant normal :weight normal :height 113 :width normal)))))
