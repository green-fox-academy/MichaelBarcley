using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AspDotNetIntroApp.Models
{
    public class Greeting
    {
        public long Id;
        public String Content;

        public Greeting()
        {

        }

        public Greeting(long id, string content)
        {
            Id = id;
            Content = content;
        }

        public long GetId()
        {
            return this.Id;
        }

        public void SetId(long id)
        {
            this.Id = id;
        }

        public String GetContent()
        {
            return this.Content;
        }

        public void SetContent(String content)
        {
            this.Content = content;
        }
    }
}
